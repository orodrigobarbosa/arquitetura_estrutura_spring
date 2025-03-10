package io.github.cursoudemy.arquiteturaspring.montadora;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipoMotor;

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cilindros=" + cilindros +
                ", litragem=" + litragem +
                ", tipoMotor=" + tipoMotor +
                '}';
    }
}
