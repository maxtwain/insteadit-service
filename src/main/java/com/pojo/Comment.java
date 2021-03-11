package com.pojo;

import com.entity.CommentEntity;
import lombok.*;

import javax.transaction.Transactional;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class Comment {
    private Integer commentId;
    private String commentContent;
    private Integer likeCount;
    private User user;
    private com.pojo.Thread thread;

    public Comment(CommentEntity commentEntity){
        commentId = commentEntity.getCommentId();
        commentContent = commentEntity.getCommentContent();
        likeCount = commentEntity.getLikeCount();
//        user = new User(commentEntity.getUserEntity());
//        thread = new Thread(commentEntity.getThreadEntity());
    }
}
