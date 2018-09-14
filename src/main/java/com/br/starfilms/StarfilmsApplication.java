package com.br.starfilms;

import com.br.starfilms.model.entity.Login;
import com.br.starfilms.model.repository.LoginRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.br.starfilms*"})
@EnableJpaRepositories(basePackages = {"com.br.starfilms.model.repository"})
public class StarfilmsApplication implements CommandLineRunner{
    @Autowired
    private LoginRepository loginRepository; 
    
    
    public static void main(String[] args) {
        SpringApplication.run(StarfilmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Login login = new Login(null, "stos","stos123");
        loginRepository.saveAll(Arrays.asList(login));
        
        
    }
    
    
    

    
}
