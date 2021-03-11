package com.access;

import com.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<CommentEntity, Integer> {

}
