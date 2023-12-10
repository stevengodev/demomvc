package com.steven.alkosto.demomvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(
        @PropertySource("classpath:atributos.properties")
)
public class ArchivosPropertiesConfig {
}
