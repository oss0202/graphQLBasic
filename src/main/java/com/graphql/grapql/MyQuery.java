package com.graphql.grapql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.domain.Post;
import com.graphql.dto.PostResponse;
import com.graphql.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MyQuery implements GraphQLQueryResolver {
    private final PostRepository postRepository;

    public List<PostResponse> getRecentPosts(int count, int offset) {
        final List<Post> all = postRepository.findAll();
        return PostResponse.from(all);
    }
}