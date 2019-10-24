package cn.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author liaoqiangang
 * @date 2019/10/16 12:41 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 */
@ApiIgnore
@Controller
@RequestMapping("/jsp")
public class JspController {
  @RequestMapping(value = "/hi",method = RequestMethod.GET)
  public String sayHello() {
    System.out.println("jsp测试");
    return "index";
  }
}
