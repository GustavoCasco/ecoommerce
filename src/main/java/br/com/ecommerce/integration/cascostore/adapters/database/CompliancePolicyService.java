package br.com.ecommerce.integration.cascostore.adapters.database;

import br.com.ecommerce.integration.cascostore.model.entity.CompliancePolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CompliancePolicyService extends JpaRepository<CompliancePolicyEntity, Long> {
}
