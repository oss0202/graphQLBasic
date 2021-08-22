package com.graphql.domain;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String text;
    private String category;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id")
    private Author author;
}
