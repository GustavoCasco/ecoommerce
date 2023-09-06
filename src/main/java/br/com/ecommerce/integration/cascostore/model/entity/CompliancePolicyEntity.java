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
@Table(name = "tbhg_politica_conformidade")
public class CompliancePolicyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
