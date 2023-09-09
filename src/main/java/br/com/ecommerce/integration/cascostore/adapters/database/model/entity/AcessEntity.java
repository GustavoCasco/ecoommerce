package br.com.ecommerce.integration.cascostore.adapters.database.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;


@Getter
@Entity
@Table(name = "tbhg_acesso")
@Builder
public class AcessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acesso")
    private Long idAcess;

    private String email;

    @Column(name = "palavra_chave")
    private String keyword;

    @JsonIgnore
    @OneToOne(mappedBy = "acessEntity")
    private UserEntity userEntity;
}
