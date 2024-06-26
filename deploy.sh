IS_GREEN=$(docker ps | grep interview-production-green)
DEFAULT_CONF="/etc/nginx/nginx.conf"

if [ -z $IS_GREEN  ]; then

  echo "### BLUE => GREEN ###"

  echo "1. get green image"
  docker-compose pull interview-production-green

  echo "2. green container up"
  docker-compose up -d interview-production-green

  while [ 1 = 1 ]; do
  echo "3. green health check..."
  sleep 3

  REQUEST=$(curl http://127.0.0.1:8080)
    if [ -n "$REQUEST" ]; then
        echo "health check success"
        break ;
    fi
  done;

  echo "4. reload nginx"
  sudo cp /etc/nginx/nginx.green.conf /etc/nginx/nginx.conf
  sudo nginx -s reload

  echo "5. blue container down"
  docker-compose stop interview-production-blue
else
  echo "### GREEN => BLUE ###"

  echo "1. get blue image"
  docker-compose pull interview-production-blue

  echo "2. blue container up"
  docker-compose up -d interview-production-blue

  while [ 1 = 1 ]; do
    echo "3. blue health check..."
    sleep 3
    REQUEST=$(curl http://127.0.0.1:8081)

    if [ -n "$REQUEST" ]; then
      echo "health check success"
      break ;
    fi
  done;

  echo "4. reload nginx"
  sudo cp /etc/nginx/nginx.blue.conf /etc/nginx/nginx.conf
  sudo nginx -s reload

  echo "5. green container down"
  docker-compose stop interview-production-green
fi