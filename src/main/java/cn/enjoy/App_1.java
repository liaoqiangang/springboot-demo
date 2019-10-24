package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liaoqiangang
 * @date 2019/10/15 5:56 PM
 * @desc 使用外置的tomcat启动
 *     默认的启动类要继承SpringBootServletInitiailzer类，并复写configure()方法
 * @lastModifier
 * @lastModifyTime
 */
@SpringBootApplication
@MapperScan(basePackages = "com.niuniu.dao")
@EnableTransactionManagement
public class App_1 extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(App_1.class,args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
}
