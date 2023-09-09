package br.com.ecommerce.integration.cascostore.adapters.database;

import br.com.ecommerce.integration.cascostore.adapters.database.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends JpaRepository<UserEntity, Long> {
}
