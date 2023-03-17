package com.brs.ratingservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Rating{

    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private Integer rating;
    private String feedback;

}
