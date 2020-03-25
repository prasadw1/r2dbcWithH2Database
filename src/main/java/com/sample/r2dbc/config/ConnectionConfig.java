/*
 * package com.sample.r2dbc.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import io.r2dbc.h2.H2ConnectionConfiguration; import
 * io.r2dbc.h2.H2ConnectionFactory; import io.r2dbc.spi.ConnectionFactory;
 * 
 * @Configuration public class ConnectionConfig {
 * 
 * @Bean public ConnectionFactory connectionFactory() {
 * 
 * 
 * return new H2ConnectionFactory( H2ConnectionConfiguration.builder()
 * //.inMemory("testdb") .file("./testdb") .username("user")
 * .password("password").build() );
 * 
 * 
 * 
 * return new H2ConnectionFactory(
 * H2ConnectionConfiguration.builder().inMemory("testdb").file("./testdb")
 * .username("user").password("password").build());
 * 
 * 
 * 
 * } }
 */