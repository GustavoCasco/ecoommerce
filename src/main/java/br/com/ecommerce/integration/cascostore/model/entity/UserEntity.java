package br.com.ecommerce.integration.cascostore.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Table(name = "tbgh_acesso")
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @OneToOne
    @JoinColumn(name = "id_acesso")
    private AcessEntity acessEntity;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private AddresEntity addresEntity;

    @OneToOne
    @JoinColumn(name = "id_politica")
    private CompliancePolicyEntity compliancePolicyEntity;

}
