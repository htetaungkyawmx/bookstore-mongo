package org.example.bookstoremongo.config;

import graphql.scalars.ExtendedScalars;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;
import org.springframework.stereotype.Controller;

@Configuration
public class GraphqlConfig {

        @Bean
        public RuntimeWiringConfigurer runtimeWiringConfigurer() {
            return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.Date);
        }

}
