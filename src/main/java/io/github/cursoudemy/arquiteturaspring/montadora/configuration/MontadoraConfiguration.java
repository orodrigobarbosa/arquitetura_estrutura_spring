package io.github.cursoudemy.arquiteturaspring.montadora.configuration;

import io.github.cursoudemy.arquiteturaspring.montadora.Motor;
import io.github.cursoudemy.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {
    //nesta classe estarão as config de Beans


    @Bean
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(6);
        motor.setModelo("ABC-01");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);

        return motor;
    }
}
