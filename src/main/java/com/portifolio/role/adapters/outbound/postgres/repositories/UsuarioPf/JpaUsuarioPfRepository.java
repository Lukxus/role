package com.portifolio.role.adapters.outbound.postgres.repositories.UsuarioPf;

import com.portifolio.role.adapters.outbound.postgres.entities.JpaUsuarioPfEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface JpaUsuarioPfRepository extends CrudRepository<JpaUsuarioPfEntity, Long>, JpaSpecificationExecutor<JpaUsuarioPfEntity> {

}
