package cn.enjoy.utils;

import cn.enjoy.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author liaoqiangang
 * @date 2019/10/16 7:05 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 **/
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class SpringRedisTest {

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis() throws Exception {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("name", "enjoy");
        ops.set("name", "liaoqiangang");
        String value = ops.get("name");
        System.out.println(value);
    }

}
