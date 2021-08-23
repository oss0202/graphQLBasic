package com.graphql.grapql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.domain.Author;
import com.graphql.dto.PostResponse;
import com.graphql.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostResolver implements GraphQLResolver<PostResponse> {
    private final AuthorRepository authorRepository;

    public Author getAuthor(PostResponse postResponse) {
        return authorRepository.findById(postResponse.getAuthor().getId()).orElseThrow(NullPointerException::new);
    }
}