package com.deepak.JUnit_Testing.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Setter
@Getter
public class CloudVendorException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}
