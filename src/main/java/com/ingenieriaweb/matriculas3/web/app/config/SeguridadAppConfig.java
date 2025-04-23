
package com.ingenieriaweb.matriculas3.web.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;



@Configuration
@EnableWebSecurity
public class SeguridadAppConfig{
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("admin")
                .password("1234")
                .roles("administrador")
                .build());
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("estu")
                .password("1357")
                .roles("estudiante")
                .build());
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("ase")
                .password("0000")
                .roles("asesor")
                .build());
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("doc")
                .password("1111")
                .roles("docente")
                .build());
        return manager;
    }
}