package br.com.ecommerce.integration.cascostore.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@Table(name = "tbgh_acesso")
@Builder
public class AcessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_acesso")
    private Long idAcess;

    private String email;

    @Column(name = "palavra_chave")
    private String keyword;

    @JsonIgnore
    @OneToOne(mappedBy = "acessEntity")
    private UserEntity userEntity;
}
