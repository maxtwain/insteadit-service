package com.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pojo.Comment;
import com.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "userEntity")
    @JsonManagedReference
    private Set<ThreadEntity> threadEntities;

    @OneToMany(mappedBy = "userEntity")
    @JsonManagedReference
    private Set<CommentEntity> commentEntities;

    public UserEntity(User user){
        userId = user.getUserId();
        username = user.getUsername();
        password = user.getPassword();
        threadEntities = new HashSet<>();
        for(com.pojo.Thread thread: user.getThreads()){
            threadEntities.add(new ThreadEntity(thread));
        }
        commentEntities = new HashSet<>();
        for(Comment comment: user.getComments()){
            commentEntities.add(new CommentEntity(comment));
        }
    }
}
