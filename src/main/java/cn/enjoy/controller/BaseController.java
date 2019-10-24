package cn.enjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author liaoqiangang
 * @date 2019/10/16 12:21 PM
 * @desc
 * @lastModifier
 * @lastModifyTime
 **/
@ApiIgnore
@RestController
public class BaseController {

    @RequestMapping(value = "/404.do",method = RequestMethod.GET)
    public String error404Page(){
        return "404";
    }
}
