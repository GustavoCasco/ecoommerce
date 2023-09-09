package br.com.ecommerce.integration.cascostore.adapters.database.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Table(name = "tbhg_usuario")
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUser;

    @Column(name = "nome")
    private String name;

    @Column(name = "numero_documento")
    private Long documentNumber;

    @Column(name = "idade")
    private Integer age;

    @Column(name = "celular")
    private Long numberPhone;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_acesso")
    private AcessEntity acessEntity;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_endereco")
    private AddresEntity addresEntity;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_politica")
    private CompliancePolicyEntity compliancePolicyEntity;

}
