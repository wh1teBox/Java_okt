package lesson2.HW.task4;

import lesson2.HW.task3.Skill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;

public class Main {
    public static void main(String[] args) {

        ArrayList<Post> posts = new ArrayList<>();
        ArrayList<Comment> comments = new ArrayList<>();

        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "qwertyuiop"));
        posts.add(new Post(1, 2, "gfgfgfgfgf", "hfhfhfhfhfhfhfhfh"));
        posts.add(new Post(1, 3, "gfhfhfhhfhfhfhfh", "jdjdjdjjdjdjdjdjdjd"));

        comments.add(new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "gfgfgfgfgfg"));
        comments.add(new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "gftrvbsfdre"));
        comments.add(new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "qqqahhhhdeeee"));
        comments.add(new Comment(2, 7, "et omnis dolorem", "Mallory_Kunze@marie.org", "fgrtvbdf"));
        comments.add(new Comment(2, 8, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "qqqahhhhdeeee"));
        comments.add(new Comment(3, 13, "et officiis id praesentium hic aut ipsa", "Kariane@jadyn.tv", "qqqahhhhdeeee"));
        comments.add(new Comment(3, 14, "aut inventore non pariatur sit vitae voluptate", "Nathan@solon.io", "qqqahhhhdeeee"));

        for (var post:posts){
            for (var comment:comments){
                if (post.getId() == comment.getPostID()) {
                    post.getComments();
                }
            }
        }

        for(var post:posts){
            System.out.println("Post #"+ post.getId());
        }
        for (var comment:comments){
            System.out.println("\tComment" + comment.getId());
        }
        System.out.println();
    }

}

