package cn.enjoy.controller;

import cn.enjoy.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liaoqiangang
 * @date 2019/10/15 6:00 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 */
@RestController
public class UserController {

  private final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired private IUserService iUserService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Object index() {
    logger.info("牛牛金融服务，slf4  log打印！");
    logger.debug("这个一个hello日志");
    Map<String,String> map = new HashMap<>();
    map.put("username","liaoqiangang");
    map.put("appname","牛牛金融服务");
    return map;
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(String username, String passwd) {
    boolean login = iUserService.login(username, passwd);
    if (login) {
      return "登陆成功";
    } else {
      return "登陆失败";
    }
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public String register(String username, String passwd) {
    boolean login = iUserService.register(username, passwd);
    if (login) {
      return "注册成功";
    } else {
      return "注册失败";
    }
  }

  @RequestMapping(value = "/batchAdd", method = RequestMethod.POST)
  public String batchAdd(String username, String passwd) {
    iUserService.batchAdd(username, passwd);
    return "成功";
  }
}
