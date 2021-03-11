package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pojo.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    private Integer commentId;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "like_count")
    private Integer likeCount;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_fk")
    @JsonBackReference
    private UserEntity userEntity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "thread_fk")
//    @JsonManagedReference
    private ThreadEntity threadEntity;

    public CommentEntity(Comment comment){
        commentId = comment.getCommentId();
        commentContent = comment.getCommentContent();
        likeCount = comment.getLikeCount();
//        userEntity = new UserEntity(comment.getUser());
        threadEntity = new ThreadEntity(comment.getThread());
    }
}
