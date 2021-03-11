package com.access;

import com.entity.ThreadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThreadDao extends JpaRepository<ThreadEntity, Integer> {

}
