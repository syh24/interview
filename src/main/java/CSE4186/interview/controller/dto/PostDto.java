package CSE4186.interview.controller.dto;

import CSE4186.interview.entity.Post;
import CSE4186.interview.entity.User;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class PostDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class createRequest {
        private String title;
        private String content;
        @NotBlank
        private Long userId;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class updateRequest {
        @NotBlank
        private Long id;
        private String title;
        private String content;
    }

    @RequiredArgsConstructor
    @Getter
    public static class Response {
        private final Long id;
        private final String title;
        private final String content;
        private final String createdAt;
        private final String updatedAt;
        private final Long userId;
        private final List<CommentDto.Response> comments;

        public  Response(Post post) {
            this.id = post.getId();
            this.content = post.getContent();
            this.title = post.getContent();
            this.createdAt = String.valueOf(post.getCreatedAt());
            this.updatedAt = String.valueOf(post.getUpdatedAt());
            this.userId = post.getUser().getId();
            this.comments = post.getComments().stream().map(CommentDto.Response::new).collect(Collectors.toList());
        }
    }
}
