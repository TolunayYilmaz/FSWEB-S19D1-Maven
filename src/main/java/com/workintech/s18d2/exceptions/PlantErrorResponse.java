package com.workintech.s18d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlantErrorResponse {
    private int status;
    private String message;
    private long timestamp;

    public PlantErrorResponse(String message) {
        this.message = message;
    }
}