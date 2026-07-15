package com.jpmc.midascore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.jpmc.midascore.foundation.Transaction;

@Component
public class TransactionListener {

    @KafkaListener(
        topics = "${general.kafka-topic}",
        groupId = "midas-core"
    )
    public void processMessage(Transaction transaction) {
        System.out.println("Transaction Received: " + transaction);
    }
}