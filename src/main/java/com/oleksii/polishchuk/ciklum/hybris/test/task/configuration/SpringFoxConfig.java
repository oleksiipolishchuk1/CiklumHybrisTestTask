package com.oleksii.polishchuk.ciklum.hybris.test.task.configuration;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SpringFoxConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.oleksii.polishchuk.ciklum.hybris.test.task.controller"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfo(
        "Ciklum Hybris Test Task API",
        "REST API of ciklum.hybris.test.task project",
        "0.0.1",
        "urn:tos",
        ApiInfo.DEFAULT_CONTACT,
        "Apache 2.0",
        "http://www.apache.org/licenses/LICENSE-2.0",
        Collections.emptyList());
  }

  private CorsConfigurationSource configurationSource() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration config = new CorsConfiguration();
    config.addAllowedOrigin("*");
    config.setAllowCredentials(true);
    config.addAllowedHeader("X-Requested-With");
    config.addAllowedHeader("Content-Type");
    config.addAllowedHeader("Authorization");
    config.addAllowedHeader("xtoken");
    config.addAllowedMethod(HttpMethod.POST);
    config.addAllowedMethod(HttpMethod.GET);
    config.addAllowedMethod(HttpMethod.OPTIONS);
    config.addAllowedMethod(HttpMethod.HEAD);
    config.addAllowedMethod(HttpMethod.PATCH);
    config.addAllowedMethod(HttpMethod.PUT);
    source.registerCorsConfiguration("/**", config);
    return source;
  }
}
