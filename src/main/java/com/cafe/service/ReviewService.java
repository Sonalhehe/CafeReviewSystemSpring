package com.cafe.service;

import com.cafe.model.Review;
import com.cafe.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository repo;
    public ReviewService(ReviewRepository repo) { this.repo = repo; }

    public List<Review> getAll() { return repo.findAll(); }
    public Review save(Review review) { return repo.save(review); }
}
