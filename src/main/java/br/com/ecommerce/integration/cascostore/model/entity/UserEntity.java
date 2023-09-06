package br.com.ecommerce.integration.cascostore.model.entity;

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
@Table(name = "tbgh_acesso")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long idUser;

    @Column(name = "id_usuario")
    private String name;

    @Column(name = "id_usuario")
    private Long documentNumber;

    @Column(name = "id_usuario")
    private Integer age;

    @Column(name = "id_usuario")
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
