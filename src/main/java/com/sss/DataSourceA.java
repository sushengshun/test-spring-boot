package com.sss;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;

@Configuration
@EnableScheduling
@MapperScan(basePackages = "com.sss.mapper.a" ,sqlSessionTemplateRef = "sqlSessionTemplateA")
public class DataSourceA {
	

	@Bean(name="dataSourceAaa")
	@ConfigurationProperties(prefix = "spring.datasource.a")
	@Primary
	public DataSource dataSourceA(){
		return DataSourceBuilder.create().build();
	}

	@Bean(name="transactionManagerA")
	@Primary
	public DataSourceTransactionManager dataSourceTransactionManagerA(@Qualifier("dataSourceAaa") DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}


	@Bean(name="sqlSessionFactoryA")
	@Primary
	public SqlSessionFactory sqlSessionFactoryA(@Qualifier("dataSourceAaa") DataSource dataSource) throws Exception{
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/A/*.xml"));
		bean.setTypeAliasesPackage("com.sss.model");
		return bean.getObject();
	}

	@Bean(name = "sqlSessionTemplateA")
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("sqlSessionFactoryA") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
