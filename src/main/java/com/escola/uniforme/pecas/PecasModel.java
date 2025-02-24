package com.escola.uniforme.pecas;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


    /* 
     tipo
    modelo
    tamanho
    sexo
    descrição
    */
@Data
@Entity(name = "tb_pecas")
public class PecasModel {


    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(length = 50)
    private String tipo;
    @Column(length = 10)
    private String modelo;
    @Column(length = 2)
    private String tamanho;
    @Column(length = 1)
    private String sexo;
    @Column(length = 100)
    private String descricao;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority; 

    private UUID idUser;
 


    
    
}
