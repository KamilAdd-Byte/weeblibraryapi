//package com.responsywnie.applibrary.config;
//import javax.sql.DataSource;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.context.annotation.*;
//import org.springframework.orm.jpa.*;
//import org.springframework.orm.jpa.vendor.*;
//
//@Configuration
//public class JpaConfig {
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean createEMF(JpaVendorAdapter adapter, DataSource ds) {
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setPersistenceUnitName("spring-jpa-pu");
//        emf.setDataSource(ds);
//        emf.setJpaVendorAdapter(adapter);
//        emf.setPackagesToScan("com.responsywnie.applibrary");
//        return emf;
//    }
//
//    @Bean
//    public JpaVendorAdapter createVendorAdapter() {
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setDatabase(Database.MYSQL);
//        adapter.setShowSql(true);
//        return adapter;
//    }
//
//    @Bean
//    public DataSource createDS() {
//        BasicDataSource ds = new BasicDataSource();
//        ds.setUrl("jdbc:mysql://localhost:3306/book?useUnicode=true&useJDBCCompilantTimezoneShift\\\n" +
//                "  =true&useLegacyDatetimeCode=false&serverTimezone=UTC");
//        ds.setUsername("root");
//        ds.setPassword("password");
//        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        ds.setInitialSize(5);
//        return ds;
//    }
//}
