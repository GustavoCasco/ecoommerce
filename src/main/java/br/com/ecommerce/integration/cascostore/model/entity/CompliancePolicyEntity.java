package br.com.ecommerce.integration.cascostore.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Entity
@Table(name = "tbhg_politica_conformidade")
public class CompliancePolicyEntity {

    @Id
    @Column(name = "id_politica")
    private Long idCompliance;

    @Column(name = "indicador_conformidade")
    private Boolean complianceIndicator;

    @Column(name = "indicador_marketing")
    private Boolean marketingIndicator;

    @OneToOne(mappedBy = "compliancePolicyEntity")
    private UserEntity userEntity;
}
