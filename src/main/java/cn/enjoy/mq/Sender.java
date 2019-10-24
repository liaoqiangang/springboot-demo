package cn.enjoy.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liaoqiangang
 * @date 2019/10/17 5:39 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 **/
@Component
public class Sender {
    @Resource
    private AmqpTemplate rabbitTemplate;
    public void send() {
        rabbitTemplate.convertAndSend("liaoqiangang", "this a messages !!!");
    }
}
