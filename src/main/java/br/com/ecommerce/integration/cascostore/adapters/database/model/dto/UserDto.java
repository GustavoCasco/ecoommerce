package br.com.ecommerce.integration.cascostore.adapters.database.model.dto;

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
    private String zipCode;
    private String homeNumber;
    private String email;
    private String keyword;
    private Boolean complianceIndicator;
    private Boolean marketingIndicator;
}
