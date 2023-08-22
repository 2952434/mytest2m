package yz.com.mytestservice;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import yz.com.annotation.EnableYzResourcesServer;
import yz.com.service.metas.config.EnableMetas;

@EnableMetas
// @EnableYzResourcesServer
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        MybatisAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class,
        SqlInitializationAutoConfiguration.class,
        JdbcRepositoriesAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class
}, scanBasePackages = {"yz.com.mytestservice", "yz.com.mytestresource"})
public class MytestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytestServiceApplication.class, args);
    }

}
