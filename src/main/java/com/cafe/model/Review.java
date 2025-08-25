package com.cafe.model;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reviewer;
    private String comment;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getReviewer() { return reviewer; }
    public void setReviewer(String reviewer) { this.reviewer = reviewer; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public Cafe getCafe() { return cafe; }
    public void setCafe(Cafe cafe) { this.cafe = cafe; }
}
