package com.example.javadailystockcrawling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Error {
    private String field;
    private String message;
    private String invalidValue;

}
