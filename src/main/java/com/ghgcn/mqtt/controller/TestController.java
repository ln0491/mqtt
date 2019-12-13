package com.ghgcn.mqtt.controller;

import com.ghgcn.mqtt.service.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘楠
 * @version 1.0.0
 * @date 2019/12/13 10:31
 */
@RestController
public class TestController {

    @Autowired
    private MqttGateway mqttGateway;

    @RequestMapping("/sendMqtt")
    public String sendMqtt(String topic,String  sendData){
        mqttGateway.sendToMqtt(topic,sendData);
        return "OK";
    }
}
