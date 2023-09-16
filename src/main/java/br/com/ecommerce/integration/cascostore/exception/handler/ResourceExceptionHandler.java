package br.com.ecommerce.integration.cascostore.exception.handler;

import br.com.ecommerce.integration.cascostore.exception.ExistingUser;
import br.com.ecommerce.integration.cascostore.exception.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ExistingUser.class)
    public ResponseEntity<StandardError> verifyExistsUser(ExistingUser existingUser,
                                                          HttpServletRequest httpServletRequest){

        StandardError standardError = StandardError.builder()
                .message(existingUser.getMessage())
                .timestamp(LocalDateTime.now())
                .path(httpServletRequest.getRequestURI())
                .build();

        return ResponseEntity.badRequest().body(standardError);

    }
}
