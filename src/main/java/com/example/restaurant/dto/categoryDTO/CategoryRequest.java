package com.example.restaurant.dto.categoryDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryRequest {
    private String name;
    private byte[] image;
}
