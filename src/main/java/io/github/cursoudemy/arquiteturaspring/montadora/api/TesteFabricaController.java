package io.github.cursoudemy.arquiteturaspring.montadora.api;

import io.github.cursoudemy.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {



    @Autowired
    private Motor motor;


    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaCivic(motor);
        return carro.darIgnicao(chave);
    }


}
