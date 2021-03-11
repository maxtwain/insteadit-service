package com.control;

import com.pojo.Comment;
import com.pojo.User;
import com.service.CommentService;
import com.service.ThreadService;
import com.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("setup")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SetupControl {
    private final CommentService commentService;
    private final ThreadService threadService;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> setup(){
        com.pojo.Thread thread0 = new com.pojo.Thread("a title", "some content");
//        threadService.save(thread0);

//        List<com.pojo.Thread> threadSet0 = new ArrayList<>();
//        threadSet0.add(thread0);

        Comment comment0 = new Comment("a comment", 3);
        comment0.setThread(thread0);

        List<Comment> commentSet0 = new ArrayList<>();
        commentSet0.add(comment0);
        thread0.setComments(commentSet0);

        commentService.save(comment0);

//        User user0 = new User("zebra", "zucchini", threadSet0, commentSet0);
//        userService.save(user0);

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Comment>> getStuff(){
        List<Comment> comments = commentService.findAll();
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
}
