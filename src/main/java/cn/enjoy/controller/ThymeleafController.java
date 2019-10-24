package cn.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author liaoqiangang
 * @date 2019/10/16 4:36 PM
 * @desc    testThymeleaf 模版
 * @lastModifier
 * @lastModifyTime
 **/
@ApiIgnore
@Controller
@RequestMapping("/tpl")
public class ThymeleafController {
    @RequestMapping(value = "/testThymeleaf",method = RequestMethod.GET)
    public String testThymeleaf(ModelMap map) {
        // 设置属性
        map.addAttribute("name", "liaoqiangang");
        // testThymeleaf：为模板文件的名称
        // 对应src/main/resources/templates/testThymeleaf.html
        return "testThymeleaf";
    }
}

