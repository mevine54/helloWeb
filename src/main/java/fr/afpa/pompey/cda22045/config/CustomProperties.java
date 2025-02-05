package fr.afpa.pompey.cda22045.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "fr.afpa.pompey.cda.helloweb")
@Data
public class CustomProperties {

    private String apiUrl;

    public String getApiUrl() {
        return apiUrl;
    }
}
