package io.github.cursoudemy.arquiteturaspring.montadora.configuration;

import io.github.cursoudemy.arquiteturaspring.montadora.Motor;
import io.github.cursoudemy.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {
    //nesta classe estarão as config de Beans


    @Bean(name = "motor_aspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(6);
        motor.setModelo("ABC-01");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);

        return motor;
    }
    @Bean (name = "motor_eletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(100);
        motor.setCilindros(4);
        motor.setModelo("ABC-02");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ELETRICO);

        return motor;
    }

    @Bean(name = "motor_turbo")
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
