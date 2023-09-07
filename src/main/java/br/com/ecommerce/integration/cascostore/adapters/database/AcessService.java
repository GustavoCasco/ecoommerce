package br.com.ecommerce.integration.cascostore.adapters.database;

import br.com.ecommerce.integration.cascostore.model.entity.AcessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessService extends JpaRepository<AcessEntity, Long> {
}
