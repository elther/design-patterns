package com.example.designpatterns.structural_patterns.decorator.after;

import com.example.designpatterns.structural_patterns.decorator.before.SpamFilteringCommentService;

public class App {

    private static boolean enableSpamFilter = true;
    private static boolean enabledTrimming = true;


    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if(enableSpamFilter){
            commentService = new SpamFilterlingCommentDecorator(commentService);
        }

        if(enabledTrimming){
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://www.anver.com");
    }
}
