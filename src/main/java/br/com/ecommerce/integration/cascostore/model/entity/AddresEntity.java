package br.com.ecommerce.integration.cascostore.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbhg_endereco")
public class AddresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_endereco")
    private Long idAddress;

    @Column(name = "logradouro")
    private String street;

    @Column(name = "numero_residencial")
    private String homeNumber;


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
