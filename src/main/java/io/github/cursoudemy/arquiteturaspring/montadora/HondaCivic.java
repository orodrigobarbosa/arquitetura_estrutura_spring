package io.github.cursoudemy.arquiteturaspring.montadora;

import java.awt.*;

public class HondaCivic extends Carro {

    public HondaCivic(Motor motor) {
        super(motor);
        setModelo("Civic");
        setCor(Color.ORANGE);
        setMontadora(Montadora.HONDA);

    }
}
