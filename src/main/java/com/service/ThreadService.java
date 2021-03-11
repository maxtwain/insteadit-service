package com.service;

import com.access.ThreadDao;
import com.entity.ThreadEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ThreadService {
    private final ThreadDao threadDao;

    public void save(com.pojo.Thread thread){
        ThreadEntity threadEntity = new ThreadEntity(thread);

        // TODO: if thread's comments exist, set missing fields

        threadDao.save(threadEntity);
    }
}
