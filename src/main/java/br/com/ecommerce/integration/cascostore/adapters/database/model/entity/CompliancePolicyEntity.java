package br.com.ecommerce.integration.cascostore.adapters.database.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;


@Getter
@Entity
@Table(name = "tbhg_politica_conformidade")
@Builder
public class CompliancePolicyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_politica")
    private Long idCompliance;

    @Column(name = "indicador_conformidade")
    private Boolean complianceIndicator;

    @Column(name = "indicador_marketing")
    private Boolean marketingIndicator;

    @JsonIgnore
    @OneToOne(mappedBy = "compliancePolicyEntity")
    private UserEntity userEntity;
}
