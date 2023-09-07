package br.com.ecommerce.integration.cascostore.model.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String name;
    private Long documentNumber;
    private Integer age;
    private Long numberPhone;
    private Long zipCode;
    private String homeNumber;
    private String email;
    private String keyword;
    private Boolean complianceIndicator;
    private Boolean marketingIndicator;
}
