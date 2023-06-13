package org.example.dao;

import org.example.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {
    @Query(value = "SELECT * FROM COMMENT WHERE ITEM_ID = ?", nativeQuery = true)
    List<Comment> findByItem(long item_id);
}
