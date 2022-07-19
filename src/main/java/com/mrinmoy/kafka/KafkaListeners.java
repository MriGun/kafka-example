package com.mrinmoy.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "mritech",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " 🎉🎉🎉");
    }
}
