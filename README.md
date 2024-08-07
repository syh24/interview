## 소개

<img width="300" alt="logo" src="https://github.com/among-neighbors/AN-backend/assets/64251594/aacc3b52-0422-441d-bb54-979c77eb54a0">

> 모의 면접 플랫폼 JobJourney

최근 증가하는 면접의 중요성에 대비하여 AI를 활용하여 자기소개서를 기반으로 질문을 생성하여 모의 면접 환경 제공합니다. <br>
또한 자신의 모의 면접 영상을 커뮤니티에 공유하여 사용자들에게 피드백을 받을 수 있는 커뮤니티 제공합니다. <br><br>
[JobJourney API Docs ](http://ec2-3-39-165-26.ap-northeast-2.compute.amazonaws.com:8080/swagger-ui/index.html) | [팀 회의록](https://www.notion.so/fb4ca4dad1cb4dd79a1448162a05409b?v=acde86b06c06469dad47089da7e4c1a8) 


## 개발 기간
* 24.03.11일 ~ 24.06.03일

## 맴버구성
 - 팀장  : 고동헌(FE) - 팀장, 커뮤니티 구현, 자소서 관련 기능 구현, UI/UX 디자인
 - 팀원1 : 김나영(FE) - 모의 면접 기능 구현, 로그인 구현, UI/UX 디자인
 - 팀원2 : 서윤혁(BE) - CI/CD 구축, 모의 면접 커뮤니티 기능 구현, 데이터베이스 스키마 설계
 - 팀원3 : 이민수(BE) - Gemini API 관리 및 프롬프트 엔지니어링, TTS / STT API 연동
 - 팀원4 : 김소현(BE) - Gemini API 관리 및 프롬프트 엔지니어링, 회원가입/로그인 기능 구현

## 기술스택
- **Language**: `Java 21`
- **Framework** : Springboot(3.2.3)
- **Database** : MySQL
- **ORM** : JPA

## 개발 내용 (★: 내가 개발한 것)
### 모의 면접
 - 자소서 CRUD (★)
 -	Gemini API 연동
 -	Google TTS, STT API 연동
 -	면접 영상 CRUD (★)

### 커뮤니티
 - 게시글 CRUD (★)
 - 게시글 검색 기능 (제목, 내용) (★)
 - 댓글 CRUD (★)
 - 게시글 좋아요 및 신고 기능 (★)

### 로그인/회원가입
- 회원가입
- 소셜 로그인 (구글)
- 로그인 기능 (JWT 토큰 활용)


## 프로젝트 화면

### 메인화면
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/dca04873-71d5-44be-972d-1056b94cbde1">

### 로그인 화면
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/252ef088-26c3-4546-af8e-4021ee78d1dd">

### 자기소개서 선택
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/cb9ad238-cead-4980-913f-8a7bde2ac1ab">

### 직무/질문개수/추가질문 입력
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/9d45f39e-d5fa-403a-8abc-796b4862c28c">

### 면접 실행 화면
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/442a29de-7332-4611-a178-c3ac4b3f47a0">

### 면접 종료 화면
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/c4fce79d-1316-402d-9e1d-370f0e56ba21">

### 커뮤니티 화면
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/efaefef3-c91a-4596-b97e-fc769710805d">

### 면접 영상 평가표
<img width="400" alt="image" src="https://github.com/syh24/interview/assets/64251594/6daaff00-d815-4750-b3c4-7233403aab4d">



## Backend 구조
<img width="452" alt="image" src="https://github.com/syh24/interview/assets/64251594/c2d360f6-114e-406e-94cc-e0f4f41df41a">


## ERD Schema Diagram
<img src="https://github.com/syh24/interview/assets/64251594/b20cc98b-b013-4aa2-9e4f-5fefcc14b80e" width="500" height="500">


## 결과 보고서
[결과 보고서](https://github.com/user-attachments/files/15944075/I_5._193.212._.3.docx)
