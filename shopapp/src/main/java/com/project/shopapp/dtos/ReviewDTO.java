package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewDTO {

    @JsonProperty("user_id")
    @Min(value = 1, message = "User ID must be > 0")
    private Long userId;

    @JsonProperty("product_id")
    @Min(value = 1, message = "Product ID must be > 0")
    private Long productId;

    @Min(value = 1)
    @Max(value = 5)
    private int rating;

    private String comment;
}
