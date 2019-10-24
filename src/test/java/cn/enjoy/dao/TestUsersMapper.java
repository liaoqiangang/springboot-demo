package cn.enjoy.dao;

import cn.enjoy.App;
import cn.enjoy.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author liaoqiangang
 * @date 2019/10/15 11:10 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 **/
@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class TestUsersMapper {

    @Resource
    private UsersMapper usersMapper;

    @Test
    public void testAdd() {
        Users user = new Users() ;
        user.setPasswd("123");
        user.setUsername("enjoy");
        usersMapper.insertSelective(user);
    }

    @Test
    public void testFindUser() {
        Users enjoy = usersMapper.findByUsernameAndPasswd("enjoy", "123");
        System.out.println(enjoy);
    }

}
