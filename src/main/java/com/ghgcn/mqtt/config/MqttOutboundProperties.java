package com.ghgcn.mqtt.config;

import lombok.Data;

/**
 * @author 刘楠
 * @version 1.0.0
 * @date 2019/12/13 15:33
 */
@Data
public class MqttOutboundProperties {

    private String clientId;
    private String topic;
}

