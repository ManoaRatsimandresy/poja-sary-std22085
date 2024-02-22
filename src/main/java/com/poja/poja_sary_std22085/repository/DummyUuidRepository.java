package com.poja.poja_sary_std22085.repository;

import com.poja.poja_sary_std22085.PojaGenerated;
import com.poja.poja_sary_std22085.repository.model.DummyUuid;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}
