package com.escola.uniforme.pecas;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPecasRepository extends JpaRepository<PecasModel, UUID>{
    
}
