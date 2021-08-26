package forum.post.Service;

import forum.post.model.Post;
import forum.post.postRepository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post savePost(Post post)
    {
       return repository.save(post);
    }
    public List<Post> getPost()
    {
        return repository.findAll();
    }

   public Post upvote(Post post)
   {
    Post existingPost=repository.findById(post.getId()).orElse(null);
    existingPost.setUpVotes(post.getUpVotes()+1);
    return repository.save(existingPost);
   }
    public Post downvote(Post post)
    {
        Post existingPost=repository.findById(post.getId()).orElse(null);
        existingPost.setDownVotes(post.getDownVotes()+1);
        return repository.save(existingPost);
    }

}
