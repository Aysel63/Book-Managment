package com.minilibrary.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String title;

    @Column (nullable = false,unique = true)
    private String isbn;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="author_id",nullable = false)
    @JsonBackReference
    private Author author;
}
