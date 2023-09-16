package br.com.ecommerce.integration.cascostore.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@Getter
public class StandardError {

    private LocalDateTime timestamp;
    private String message;
    private String path;
}
