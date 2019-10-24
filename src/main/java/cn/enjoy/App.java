package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liaoqiangang
 * @date 2019/10/15 5:56 PM
 * @desc 默认的application启动，在创建项目时自动生成application启动类，直接run执行即可
 * @lastModifier
 * @lastModifyTime
 */
@SpringBootApplication
@MapperScan(basePackages = "com.niuniu.dao")
@EnableTransactionManagement
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
