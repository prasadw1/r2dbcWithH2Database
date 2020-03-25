/*
 * package com.sample.r2dbc.config;
 * 
 * import org.springframework.beans.factory.annotation.Configurable; import
 * org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration; import
 * org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
 * 
 * import io.r2dbc.spi.ConnectionFactory;
 * 
 * @Configurable
 * 
 * @EnableR2dbcRepositories public class R2DBCConfig extends
 * AbstractR2dbcConfiguration {
 * 
 * ConnectionFactory connectionFactory;
 * 
 * R2DBCConfig(ConnectionFactory connectionFactory){ this.connectionFactory =
 * connectionFactory; }
 * 
 * @Override public ConnectionFactory connectionFactory() { return
 * this.connectionFactory; }
 * 
 * 
 * 
 * }
 */