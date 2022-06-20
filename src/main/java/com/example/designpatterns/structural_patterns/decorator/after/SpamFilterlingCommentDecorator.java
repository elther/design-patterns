package com.example.designpatterns.structural_patterns.decorator.after;

public class SpamFilterlingCommentDecorator extends CommentDecorator{

    public SpamFilterlingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if(isNotSpam(comment)){
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        return !comment.contains("http");
    }
}
