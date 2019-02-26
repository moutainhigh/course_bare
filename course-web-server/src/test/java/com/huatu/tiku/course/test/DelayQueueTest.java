package com.huatu.tiku.course.test;

import com.huatu.common.test.BaseWebTest;
import com.huatu.tiku.course.spring.conf.queue.DelayQueue;
import com.huatu.tiku.course.spring.conf.queue.DelayQueueProcessListener;
import com.huatu.tiku.course.spring.conf.queue.Message;
import com.huatu.tiku.course.spring.conf.queue.RedisDelayQueue;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 描述：
 *
 * @author biguodong
 * Create time 2019-02-26 下午3:29
 **/
@Slf4j
public class DelayQueueTest extends BaseWebTest {

    private RedisDelayQueue redisDelayQueue;
    @Autowired
    private RedisTemplate redisTemplate;

    @Before
    public void init(){
        redisDelayQueue = new RedisDelayQueue("delayQueuetest", "", redisTemplate, 60 * 1000, new DelayQueueProcessListener() {
            @Override
            public void ackCallback(Message message) {

            }

            @Override
            public void peekCallback(Message message) {
                log.error("messageId:{}", message.getId());
                redisDelayQueue.ack(message.getId());//确认操作。将会删除消息
            }

            @Override
            public void pushCallback(Message message) {

            }
        });
    }


    @Test
    public void testCreate() throws InterruptedException {
        Message message = new Message();
        for (int i = 0; i < 10; i++) {
            message.setId(i + "");
            message.setPayload("test");
            message.setPriority(0);
            message.setTimeout(2000 * i);
            redisDelayQueue.push(message);
        }
        // message = queue.peek();
        // queue.ack("1234");
        redisDelayQueue.listen();
    }
}