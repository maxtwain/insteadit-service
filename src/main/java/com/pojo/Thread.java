package com.pojo;

import com.entity.ThreadEntity;
import lombok.*;

import javax.transaction.Transactional;

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

    public Thread(ThreadEntity threadEntity){
        threadId = threadEntity.getThreadId();
        threadTitle = threadEntity.getThreadTitle();
        threadContent = threadEntity.getThreadContent();
//        user = new User(threadEntity.getUserEntity());
    }
}
