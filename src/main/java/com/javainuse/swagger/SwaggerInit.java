package com.javainuse.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 
@SpringBootApplication
public class SwaggerInit {


		public static void main(String[] args) {
			SpringApplication.run(SwaggerInit.class, args);
		}

		@Bean
		public Docket swaggerUm() {
			 return new Docket(DocumentationType.SWAGGER_2)
				        .groupName("employee-1.0")
				        .select()
				            .apis(RequestHandlerSelectors.basePackage("/employee"))
				            .paths(PathSelectors.any())
				        .build()
				        .apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API").description("Documentation Employ API v1.0").build());
		}

	}



