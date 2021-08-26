package forum.post.controller;

import forum.post.Service.PostService;
import forum.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class postController {
    @Autowired
    private PostService postService;
    @PostMapping("/savePost")
    public Post addPost(@RequestBody Post post)
    {
        return postService.savePost(post);
    }
    @PutMapping("/upvote")
   public Post upvote(@RequestBody Post post)
   {
       return postService.upvote(post);
   }
    @PutMapping("/downvote")
    public Post downvote(@RequestBody Post post)
    {
        return postService.downvote(post);
    }
    @GetMapping("")
    public List<Post> findAllcards() {
        return postService.getPost();}

}
