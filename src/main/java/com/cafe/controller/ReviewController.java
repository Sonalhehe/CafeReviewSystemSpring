
package com.cafe.controller;

import com.cafe.model.Review;
import com.cafe.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {
    private final ReviewService service;
    public ReviewController(ReviewService service) { this.service = service; }

    @GetMapping
    public List<Review> getAllReviews() { return service.getAll(); }

    @PostMapping
    public Review addReview(@RequestBody Review review) { return service.save(review); }
}
