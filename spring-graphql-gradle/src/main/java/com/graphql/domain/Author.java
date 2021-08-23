package com.graphql.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
