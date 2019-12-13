package com.ghgcn.mqtt;

import com.ghgcn.mqtt.config.MqttProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MqttProperties.class)
public class MqttApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MqttApplication.class)
//                .web(WebApplicationType.NONE)
                .run(args);
    }

}
