package com.example.demo6.kafka;

import com.example.demo6.GeneralInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RequestMapping("kafka")
@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @GetMapping("get")
    public boolean get(@RequestParam String message){
        kafkaTemplate.send("testTopic",message);
        return true;
    }

    @PostMapping("set")
    public boolean set(@RequestBody GeneralInfo info){
        kafkaTemplate.send("testTopic", "name", info.getName());
        return true;
    }

}

