package br.com.ecommerce.integration.cascostore.adapters.database;

import br.com.ecommerce.integration.cascostore.adapters.database.model.entity.CompliancePolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompliancePolicyService extends JpaRepository<CompliancePolicyEntity, Long> {
}
