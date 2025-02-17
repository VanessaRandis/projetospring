package com.escola.uniforme.pecas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pecas")
public class PecasController {

    @Autowired
    private IPecasRepository pecasRepository;


    @PostMapping("/")
    public PecasModel create(@RequestBody PecasModel pecasModel) {
        var pecas = this.pecasRepository.save(pecasModel);  
        return pecas;
    }
    
    
}
