package com.example.taskHub.Configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class mysqlConfig {
	 @Bean(name="mysql")
//	 @ConfigurationProperties(prefix = "database")
	    public DataSource getDataSource() {
	        return DataSourceBuilder.create()
	        .driverClassName("com.mysql.jdbc.Driver")
	        .url("jdbc:mysql://localhost:3306/TaskHubBackend?createDatabaseIfNotExist=true")
	        .username("root")
	        .password("Yugb@0409")
	        .build();
	    }
	 @Bean(name="mysqlJdbcTemplate")
	    public JdbcTemplate jdbcTemplate(@Qualifier("mysql") DataSource dataSource) {
	       return new JdbcTemplate(dataSource);
	    }

}
