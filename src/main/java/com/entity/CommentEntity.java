package com.entity;

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
    private UserEntity userEntity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "thread_fk")
    private ThreadEntity threadEntity;
}
