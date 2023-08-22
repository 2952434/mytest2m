package yz.com.mytestservice.config;

import com.cloudera.impala.jdbc41.Driver;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yz.com.annotation.EnableMyBatisScanner;
import yz.com.config.MyBatisConfig;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@EnableMyBatisScanner(value = "znq", driverName = "impala", name = MyTestZnqMybatisConfig.MYBATIS_SCANNER_NAME,
        sqlSessionTemplateRef = "znqSqlSessionTemplate")
public class MyTestZnqMybatisConfig extends MyBatisConfig {
    public static final String MYBATIS_SCANNER_NAME = "znqTestMyBatisScanner";

    protected MyTestZnqMybatisConfig(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Bean
    @ConfigurationProperties(prefix = "yz.datasource.znq")
    public DataSourceProperties znqDataSourceProperties() {
        return new DataSourceProperties();
    }

    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass(Driver.class.getName());
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        DataSourceProperties dataSourceProperties = znqDataSourceProperties();
        dataSource.setJdbcUrl(dataSourceProperties.getUrl());
        dataSource.setUser(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        return dataSource;
    }

    @Override
    protected DataSource getDataSource() {
        return dataSource();
    }


    @Override
    protected String getMybatisScannerName() {
        return MYBATIS_SCANNER_NAME;
    }

    @Bean(name = "znqSqlSessionTemplate")
    @Override
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return super.sqlSessionTemplate();
    }
}
