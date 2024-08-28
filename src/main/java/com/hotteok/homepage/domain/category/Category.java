package com.hotteok.homepage.domain.category;

import com.hotteok.homepage.domain.post.Post;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "categories")
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String hierarchy;
    private String categoryName;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

}