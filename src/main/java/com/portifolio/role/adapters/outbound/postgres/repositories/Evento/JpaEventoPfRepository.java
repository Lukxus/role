package com.portifolio.role.adapters.outbound.postgres.repositories.Evento;

import com.portifolio.role.adapters.outbound.postgres.entities.JpaEventoEntity;
import com.portifolio.role.adapters.outbound.postgres.entities.JpaUsuarioPfEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface JpaEventoPfRepository extends CrudRepository<JpaEventoEntity, Long>, JpaSpecificationExecutor<JpaEventoEntity> {

}
