package br.edu.ipog.backend3.app.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    /**
     * Neste ponto estamos 'customizando' as caractesristicas da API via JAVA.
     * @param apiTitle
     * @return
     */
    @Bean
    public OpenAPI customOpenAPI(
            @Value("${swagger.apiTitle}") String apiTitle,
            @Value("${swagger.apiDescription}") String apiDescription,
            @Value("${swagger.apiVersion}") String apiVersion,
            @Value("${swagger.apiContactName}") String apiContactName,
            @Value("${swagger.apiContactEmail}") String apiContactEmail,
            @Value("${swagger.apiContactUrl}") String apiContactUrl,
            @Value("${swagger.apiTermsOfService}") String apiTermsOfService,
            @Value("${swagger.apiLicenseName}") String apiLicenseName,
            @Value("${swagger.apiLicenseUrl}") String apiLicenseUrl
    ) {
        OpenAPI openAPI = new OpenAPI()
                .info(new Info()
                        .title(apiTitle)
                        .version(apiVersion)
                        .description(apiDescription)
                        .termsOfService(apiTermsOfService)
                        .contact(new Contact()
                                .name(apiContactName)
                                .email(apiContactEmail)
                                .url(apiContactUrl))
                        .license(new License()
                                .name(apiLicenseName)
                                .url(apiLicenseUrl)));

        return openAPI;
    }
}
