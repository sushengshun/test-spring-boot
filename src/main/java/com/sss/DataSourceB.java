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

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.sss.mapper.b" ,sqlSessionTemplateRef = "sqlSessionTemplateB")
public class DataSourceB {
	

	@Bean(name="dataSourceBbb")
	@ConfigurationProperties(prefix = "spring.datasource.b")
	public DataSource dataSourceB(){
		return DataSourceBuilder.create().build();
	}

	@Bean(name="transactionManagerB")
	public DataSourceTransactionManager dataSourceTransactionManagerB(@Qualifier("dataSourceBbb") DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}


	@Bean(name="sqlSessionFactoryB")
	public SqlSessionFactory sqlSessionFactoryB(@Qualifier("dataSourceBbb") DataSource dataSource) throws Exception{
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/B/*.xml"));
		bean.setTypeAliasesPackage("com.sss.model");
		return bean.getObject();
	}

	@Bean(name = "sqlSessionTemplateB")
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("sqlSessionFactoryB") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
