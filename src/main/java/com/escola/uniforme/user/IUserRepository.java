package com.escola.uniforme.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface IUserRepository extends JpaRepository<UserModel, UUID>{



   UserModel findByUsername(String name);
    
}
