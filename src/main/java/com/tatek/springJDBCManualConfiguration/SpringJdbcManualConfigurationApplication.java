package com.tatek.springJDBCManualConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {
		JdbcTemplateAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class SpringJdbcManualConfigurationApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcManualConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		jdbcTemplate.execute("INSERT INTO DEPARTMENT VALUES(30,'Production Forestry')");
		System.out.println("\n\n Data is inserted in department table! ");
		System.out.println();
	}
}
