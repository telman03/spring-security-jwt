package app;

import app.configurations.SwaggerConfig;
import app.utilities.JwtUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
    @Bean
    public JwtUtil utilBean()throws Exception{
        return new JwtUtil();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return  NoOpPasswordEncoder.getInstance();
    }
}
