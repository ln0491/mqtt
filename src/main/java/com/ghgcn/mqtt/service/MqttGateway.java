package com.ghgcn.mqtt.service;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

/**
 * @author 刘楠
 * @version 1.0.0
 * @date 2019/12/13 15:40
 */
@Component
@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttGateway {
    /**
     * 发送信息
     * @param data
     */
    void sendToMqtt(String data,@Header(MqttHeaders.RETAINED)boolean retain);

    /**
     * 指定主题发送信息
     * @param topic
     * @param payload
     */
    void sendToMqtt(@Header(MqttHeaders.TOPIC) String topic, String payload,@Header(MqttHeaders.RETAINED)boolean retain);

    /**
     * 指定主题和qos发送信息
     * @param topic
     * @param qos
     * @param payload
     */
    void sendToMqtt(@Header(MqttHeaders.TOPIC) String topic, @Header(MqttHeaders.QOS) int qos, String payload,@Header(MqttHeaders.RETAINED)boolean retain);
}


