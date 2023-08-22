// package yz.com.mytestservice.config;
//
// import com.cloudera.impala.jdbc41.Driver;
// import com.mchange.v2.c3p0.ComboPooledDataSource;
// import org.mybatis.spring.SqlSessionTemplate;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import yz.com.annotation.EnableMyBatisScanner;
// import yz.com.config.MyBatisConfig;
//
// import javax.sql.DataSource;
// import java.beans.PropertyVetoException;
//
// @Configuration
// @EnableMyBatisScanner(value = "meta", driverName = "impala", name = MyTestMybatisConfig.MYBATIS_SCANNER_NAME,
//         sqlSessionTemplateRef = "metaSqlSessionTemplate")
// public class MyTestMybatisConfig extends MyBatisConfig {
//     public static final String MYBATIS_SCANNER_NAME = "myTestMyBatisScanner";
//
//     protected MyTestMybatisConfig(ApplicationContext applicationContext) {
//         super(applicationContext);
//     }
//
//     @Bean
//     @ConfigurationProperties(prefix = "yz.datasource.meta")
//     public DataSourceProperties metaDataSourceProperties(){
//         return new DataSourceProperties();
//     }
//
//     public DataSource dataSource() {
//         ComboPooledDataSource dataSource = new ComboPooledDataSource();
//         try {
//             dataSource.setDriverClass(Driver.class.getName());
//         } catch (PropertyVetoException e) {
//             e.printStackTrace();
//         }
//         DataSourceProperties dataSourceProperties = metaDataSourceProperties();
//         dataSource.setJdbcUrl(dataSourceProperties.getUrl());
//         dataSource.setUser(dataSourceProperties.getUsername());
//         dataSource.setPassword(dataSourceProperties.getPassword());
//         return dataSource;
//     }
//
//     @Override
//     protected DataSource getDataSource() {
//         return  dataSource();
//     }
//
//     @Override
//     protected String getMybatisScannerName() {
//         return MYBATIS_SCANNER_NAME;
//     }
//
//     @Bean(name = "metaSqlSessionTemplate")
//     @Override
//     public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//         return super.sqlSessionTemplate();
//     }
// }
