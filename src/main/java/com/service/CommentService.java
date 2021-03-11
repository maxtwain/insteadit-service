package com.service;

import com.access.CommentDao;
import com.entity.CommentEntity;
import com.pojo.Comment;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CommentService {
    private final CommentDao commentDao;

    public void save(Comment comment){
        CommentEntity commentEntity = new CommentEntity(comment);
        commentDao.save(commentEntity);
    }
    public List<Comment> findAll(){
        List<CommentEntity> commentEntities = commentDao.findAll();
        List<Comment> comments = new ArrayList<>();
        for (CommentEntity commentEntity: commentEntities){
            comments.add(new Comment(commentEntity));
        }
        return comments;
    }

//    CommentEntity syncComment(CommentEntity commentEntity){
//
//    }
}
