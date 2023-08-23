package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "text must not be null")
    @NotEmpty(message = "text must not be empty")
    @Column(name = "text")
    private String text;

    @NotNull(message = "user id must not be null")
    @Column(name = "user_id")
    private Long user_id;

    @ManyToOne
    @JoinColumn(name = "blog_id", referencedColumnName = "id")
    private Blogs blog;
}
