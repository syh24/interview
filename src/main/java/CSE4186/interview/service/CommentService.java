package CSE4186.interview.service;

import CSE4186.interview.entity.Comment;
import CSE4186.interview.entity.Post;
import CSE4186.interview.entity.Report;
import CSE4186.interview.entity.User;
import CSE4186.interview.exception.NotFoundException;
import CSE4186.interview.repository.CommentRepository;
import CSE4186.interview.repository.PostRepository;
import CSE4186.interview.repository.ReportRepository;
import CSE4186.interview.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static CSE4186.interview.controller.dto.CommentDto.*;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final ReportRepository reportRepository;
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public void addComment(CreateRequest request, Long postId) {
        User findUser = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new NotFoundException("해당 유저가 존재하지 않습니다."));

        Post findPost = postRepository.findById(postId)
                .orElseThrow(() -> new NotFoundException("해당 게시글이 존재하지 않습니다."));


        commentRepository.save(request.toEntity(findUser, findPost));
    }

    public void updateComment(UpdateRequest request) {
        Comment comment = commentRepository.findById(request.getId()).orElseThrow(() ->
                new NotFoundException("해당 댓글이 존재하지 않습니다."));

        comment.updateComment(request.getContent());
    }

    public void deleteComment(Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow(() ->
                new NotFoundException("해당 댓글이 존재하지 않습니다."));

        List<Report> reports = reportRepository.findReportByComment(comment);
        reports.forEach(Report::removeParentRelation);

        commentRepository.delete(comment);
    }
}
