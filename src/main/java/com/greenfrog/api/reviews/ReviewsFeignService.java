package com.greenfrog.api.reviews;

import com.greenfrog.api.reviews.models.Review;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "reviews-server")
public interface ReviewsFeignService {

    @GetMapping("/api/v1/reviews")
    ResponseEntity<List<Review>> getReviews();

    @PostMapping("/api/v1/create/review")
    ResponseEntity<Review> createReview(@RequestBody Review review);
}
