package br.com.ecommerce.integration.cascostore.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@Table(name = "tbgh_acesso")
public class AcessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_acesso")
    private Long idAcess;
    @Email
    private String email;
    @Column(name = "palavra_chave")
    private String keyword;
    @JsonIgnore
    @OneToOne(mappedBy = "acessEntity")
    private UserEntity userEntity;
}
