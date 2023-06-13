package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.Comment;
import org.example.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/comment")
    public Comment add(@RequestBody Comment comment){
        return commentService.add(comment);
    }

    @GetMapping(value = "/comment", params = {"item_id"})
    public List<Comment> findByItem(@RequestParam(value="item_id") long item_id) {
        return commentService.findByItem(item_id);
    }
    @PutMapping("/comment")
    public Comment update(@RequestBody Comment comment){
        return commentService.update(comment);
    }
    @DeleteMapping("/comment/{id}")
    public void deleteById(@PathVariable long id){
        commentService.deleteById(id);
    }
}
