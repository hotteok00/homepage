package com.hotteok.homepage.domain.tag;

import com.hotteok.homepage.domain.post.Post;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "tags")
@Getter
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String tag;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

}
