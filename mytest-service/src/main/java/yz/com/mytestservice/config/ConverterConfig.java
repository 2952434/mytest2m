// package yz.com.mytestservice.config;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import yz.com.impala.dao.meta.AreaInfoDao;
// import yz.com.resource.metas.resourcemodel.conversion.impl.ImpalaAreaInfoDaoModelConverter;
// import yz.com.resource.metas.resourcemodel.resource.AreaInfoModelResource;
//
// @Configuration
// public class ConverterConfig {
//     @Bean
//     public AreaInfoModelResource areaInfoDaoModelConverter(AreaInfoDao areaInfoDao) {
//         return new AreaInfoModelResource(new ImpalaAreaInfoDaoModelConverter(areaInfoDao));
//     }
// }
