package com.json.flexpay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiErrorResponse {

    private String message;
    private String status;
    private String statusCode;
//    private T data;
}
