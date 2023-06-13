package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dao.CommentDao;
import org.example.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentDao commentDao;
    @Override
    public Comment add(Comment comment) {
        return commentDao.save(comment);
    }

    @Override
    public List<Comment> findByItem(long item_id) {
        return commentDao.findByItem(item_id);
    }

    @Override
    public Comment update(Comment comment) {
        return commentDao.save(comment);
    }

    @Override
    public void deleteById(long id) {
        commentDao.deleteById(id);
    }
}
