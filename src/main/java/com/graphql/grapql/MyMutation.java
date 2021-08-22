package com.graphql.grapql;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.domain.Post;
import com.graphql.dto.PostResponse;
import com.graphql.repository.AuthorRepository;
import com.graphql.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyMutation implements GraphQLMutationResolver {
    private final PostRepository postRepository;
    private final AuthorRepository authorRepository;

    public PostResponse writePost(String title, String text, String category) {
//        Post post = Post.builder()
//                .title(title)
//                        .text(text)
//                                .category(category)
//                                        .author(authorRepository.getOne(1L))
//                                                .build();
        Post post = new Post();
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthor(authorRepository.getOne(1L));
        final Post save = postRepository.save(post);

        return PostResponse.from(save);
    }
}
