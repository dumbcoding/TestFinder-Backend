package org.example.service;

import org.example.model.Comment;
import org.example.model.Item;

import java.util.List;

public interface CommentService {
    Comment add(Comment comment);
    List<Comment> findByItem(long item_id);
    Comment update(Comment comment);
    void deleteById(long id);
}
