package cn.enjoy.mq;

import cn.enjoy.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author liaoqiangang
 * @date 2019/10/17 5:41 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class RabbitmqTest {
    @Resource
    private Sender sender;
    @Test
    public void testRabbitmq() throws Exception {
        sender.send();
    }
}

