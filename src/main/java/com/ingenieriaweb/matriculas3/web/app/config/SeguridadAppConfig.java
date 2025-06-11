package com.ingenieriaweb.matriculas3.web.app.config;

import com.ingenieriaweb.matriculas3.web.app.services.UsuarioDetailsService;
import com.ingenieriaweb.matriculas3.web.app.filters.JwtAuthenticationFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SeguridadAppConfig {

	 @Autowired
	    private UsuarioDetailsService usuarioDetailsService;

	    @Autowired
	    private JwtAuthenticationFilter jwtAuthenticationFilter;
	    
	    private final AuthenticationProvider authenticationProvider = null;

	    public SeguridadAppConfig(UsuarioDetailsService usuarioDetailsService, JwtAuthenticationFilter jwtAuthenticationFilter) {
	        this.usuarioDetailsService = usuarioDetailsService;
	        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
	    }
	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        return http
	            .csrf().disable()
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers(
	                    "/api/auth/**",
	                    "/login",
	                    "/registro",
	                    "/css/**",
	                    "/js/**",
	                    "/app/**",
	                    "/usuarios",
	                    "/roles"
	                ).permitAll()
	                .anyRequest().permitAll()
	            )
	            .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	            .authenticationProvider(authenticationProvider())
	            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
	            .build();
	    }


	    @Bean
	    public AuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	        provider.setUserDetailsService(usuarioDetailsService);
	        provider.setPasswordEncoder(passwordEncoder());
	        return provider;
	    }
	    @Bean
	    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
	        return http.getSharedObject(AuthenticationManagerBuilder.class)
	                .userDetailsService(usuarioDetailsService)
	                .passwordEncoder(passwordEncoder())
	                .and()
	                .build();
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	    
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	            .logout().disable() 
	            .authorizeRequests()
	                .anyRequest().authenticated();
	    }
}
