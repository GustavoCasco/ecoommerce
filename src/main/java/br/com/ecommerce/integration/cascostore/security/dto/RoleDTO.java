package br.com.ecommerce.integration.cascostore.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {

    private UUID idUser;
    private List<UUID> idsRole;

}
