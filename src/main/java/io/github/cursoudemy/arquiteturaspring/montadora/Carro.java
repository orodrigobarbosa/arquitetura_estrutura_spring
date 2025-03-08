package io.github.cursoudemy.arquiteturaspring.montadora;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montadora;


    //construtor para classe Motor
    public Carro(Motor motor) {
        this.motor = motor;
    }
}
