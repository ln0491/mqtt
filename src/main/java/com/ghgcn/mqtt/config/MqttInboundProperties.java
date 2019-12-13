package com.ghgcn.mqtt.config;

import lombok.Data;

/**
 * @author 刘楠
 * @version 1.0.0
 * @date 2019/12/13 15:32
 */
@Data
public class MqttInboundProperties {

    private String clientId;
    private String topics;
}

