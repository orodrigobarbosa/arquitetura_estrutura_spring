package io.github.cursoudemy.arquiteturaspring.montadora.configuration;

import io.github.cursoudemy.arquiteturaspring.montadora.Motor;
import io.github.cursoudemy.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {
    //nesta classe estarão as config de Beans


    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(6);
        motor.setModelo("ABC-01");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);

        return motor;
    }


    @Bean (name = "motorEletrico")
    @Primary
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(100);
        motor.setCilindros(4);
        motor.setModelo("ABC-02");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ELETRICO);

        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("ABC-03");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.TURBO);

        return motor;
    }

}
