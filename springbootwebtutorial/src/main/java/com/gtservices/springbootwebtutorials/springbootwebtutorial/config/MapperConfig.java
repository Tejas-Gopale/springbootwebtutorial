package com.gtservices.springbootwebtutorials.springbootwebtutorial.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Configuration
public class MapperConfig {

	@Bean
	public ModelMapper getModdMapper() {
		return new ModelMapper();
	}
}
