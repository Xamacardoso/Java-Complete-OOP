package PostExercise.src.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import PostExercise.src.entitites.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        CommentPost c1 = new CommentPost("Have a nice trip!");
        CommentPost c2 = new CommentPost("Wow! That's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this nice country!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        CommentPost c3 = new CommentPost("Good night");
        CommentPost c4 = new CommentPost("May the Force be with you");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

    }
}
