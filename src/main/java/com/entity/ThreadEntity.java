package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    private UserEntity userEntity;

    @OneToMany(mappedBy = "threadEntity")
    private Set<CommentEntity> commentEntities;
}
