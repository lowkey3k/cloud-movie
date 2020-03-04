package org.lht.boot.mq.kafka;

import org.junit.jupiter.api.Test;
import org.lht.boot.mq.common.User;
import org.lht.boot.mq.kafka.producer.KafkaListenableFutureCallback;
import org.lht.boot.mq.kafka.producer.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LiHaitao
 * @description KafkaTest:
 * @date 2020/1/16 14:16
 **/
@SpringBootTest
public class KafkaTest {

    @Autowired
    private KafkaSender<String, String> kafkaSender;

    @Test
    void sendTest() {
        User user = new User();
        user.setAge(31);
        user.setName("lihaitao");
        kafkaSender.send("order", "sdfsdf").addCallback(new KafkaListenableFutureCallback<>());

    }
}