package com.pojo;

import com.entity.CommentEntity;
import com.entity.ThreadEntity;
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
public class Thread {
    private Integer threadId;
    private String threadTitle;
    private String threadContent;
    private User user;
    private List<Comment> comments;

    public Thread(ThreadEntity threadEntity){
        threadId = threadEntity.getThreadId();
        threadTitle = threadEntity.getThreadTitle();
        threadContent = threadEntity.getThreadContent();
//        user = new User(threadEntity.getUserEntity());
        comments = new ArrayList<>();
        for(CommentEntity commentEntity: threadEntity.getCommentEntities()){
            comments.add(new Comment(commentEntity));
        }
    }
    public Thread(String threadTitle, String threadContent) {
        this.threadTitle = threadTitle;
        this.threadContent = threadContent;
    }
}
