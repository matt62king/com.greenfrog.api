package com.greenfrog.api.reviews.models;

public interface Review {
    void setName(String name);
    void setEmail(String email);
    void setMessage(String message);
    String getName();
    String getEmail();
    String getMessage();
}
