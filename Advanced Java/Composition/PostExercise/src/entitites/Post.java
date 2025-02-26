package PostExercise.src.entitites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    // Static date formatter to use in every instance of PostEx in toString method
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<CommentPost> comments = new ArrayList<>();

    public Post() {}
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public List<CommentPost> getComments() {
        return comments;
    }

    public void addComment(CommentPost comment) {
        comments.add(comment);
    }

    public void removeComment(CommentPost comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        // String builder is a class that helps to generate long strings from partitioned data
        StringBuilder sb = new StringBuilder();
        sb.append(this.title + "\n");
        sb.append(this.likes + " Likes - " + sdf.format(this.moment) + "\n");
        sb.append(this.content + "\n");
        sb.append("Comments:" + "\n");

        // Adds all comments that the post haves
        for (CommentPost comment : comments) {
            sb.append(comment.getText() + "\n");
        }

        return sb.toString();
    }
}
