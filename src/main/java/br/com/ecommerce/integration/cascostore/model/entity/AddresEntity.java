package br.com.ecommerce.integration.cascostore.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@Table(name = "tbhg_endereco")
public class AddresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_endereco")
    private Long idAddress;
    @Column(name = "logradouro")
    private String street;
    @Column(name = "bairro")
    private String neighborhood;
    @Column(name = "cep")
    private Long zipCode;
    @Column(name = "cidade")
    private String city;
    @Column(name = "estado")
    private String state;
    @JsonIgnore
    @OneToOne(mappedBy = "addresEntity")
    private UserEntity userEntity;
}