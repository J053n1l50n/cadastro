package com.cadastrao.cadastramento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cadastramento", path ="cadastramento")
public interface cadRepository extends JpaRepository<cadastro, Long>{

}
