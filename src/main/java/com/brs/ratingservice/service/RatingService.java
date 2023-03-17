package com.brs.ratingservice.service;

import com.brs.ratingservice.entity.Rating;

import java.util.List;

public interface RatingService{

    Rating createRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
