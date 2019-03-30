package com.evolf.cap11_Transactional.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author caohaifengx@163.com 2019-03-22 11:28
 */
@Configuration
@ComponentScan("com.evolf.cap11_Transactional")
@EnableTransactionManagement  //开启事务管理功能，对@Transactional起作用  EnableXXXX
public class Cap11MainConfig {
    //创建数据源
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        //c3p0封装 JDBC,  dataSource接口实现
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("caohaifeng");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring");
        return dataSource;
    }

    //jdbcTemplate 能简化增删改查操作
    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
         return new JdbcTemplate(dataSource());
    }

    //注册事务管理器 (对指定数据源  )
    @Bean
    public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException{
        return new DataSourceTransactionManager(dataSource());
    }
}
