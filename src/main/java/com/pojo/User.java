package com.pojo;

import com.entity.CommentEntity;
import com.entity.ThreadEntity;
import com.entity.UserEntity;
import lombok.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class User {
    private Integer userId;
    private String username;
    private String password;
    private List<com.pojo.Thread> threads;
    private List<Comment> comments;

    public User(UserEntity userEntity){
        userId = userEntity.getUserId();
        username = userEntity.getUsername();
        password = userEntity.getPassword();
        threads = new ArrayList<>();
        for(ThreadEntity threadEntity: userEntity.getThreadEntities()){
            threads.add(new Thread(threadEntity));
        }
        comments = new ArrayList<>();
        for(CommentEntity commentEntity: userEntity.getCommentEntities()){
            comments.add(new Comment(commentEntity));
        }
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(String username, String password, List<Thread> threads, List<Comment> comments) {
        this.username = username;
        this.password = password;
        this.threads = threads;
        this.comments = comments;
    }
}
