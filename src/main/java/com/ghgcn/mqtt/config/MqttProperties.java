package com.ghgcn.mqtt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘楠
 * @version 1.0.0
 * @date 2019/12/13 15:31
 */
@Data
@Configuration
@ConfigurationProperties("com.mqtt")
public class MqttProperties {

    private String urls;
    private String username;
    private String password;

    private String clientId;
    private String topics;


}

