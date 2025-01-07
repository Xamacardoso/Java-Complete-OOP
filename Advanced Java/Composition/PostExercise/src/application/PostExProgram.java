package application;

import entitites.CommentPostEx;
import entitites.PostEx;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PostExProgram {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        CommentPostEx c1 = new CommentPostEx("Have a nice trip!");
        CommentPostEx c2 = new CommentPostEx("Wow! That's awesome!");
        PostEx p1 = new PostEx(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this nice country!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        CommentPostEx c3 = new CommentPostEx("Good night");
        CommentPostEx c4 = new CommentPostEx("May the Force be with you");
        PostEx p2 = new PostEx(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

    }
}
