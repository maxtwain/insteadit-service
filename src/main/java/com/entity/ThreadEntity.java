package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pojo.Comment;
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
@Table(name = "thread")
public class ThreadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "thread_id")
    private Integer threadId;

    @Column(name = "thread_title")
    private String threadTitle;

    @Column(name = "thread_content")
    private String threadContent;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_fk")
    @JsonBackReference
    private UserEntity userEntity;

    @OneToMany(mappedBy = "threadEntity")
//    @JsonBackReference
    @JsonIgnore
    private Set<CommentEntity> commentEntities;

    public ThreadEntity(com.pojo.Thread thread){
        threadId = thread.getThreadId();
        threadTitle = thread.getThreadTitle();
        threadContent = thread.getThreadContent();
//        userEntity = new UserEntity(thread.getUser());
        commentEntities = new HashSet<>();
        for(Comment comment: thread.getComments()){
            commentEntities.add(new CommentEntity(comment));
        }
    }
}
