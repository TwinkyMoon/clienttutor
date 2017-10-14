
package com.uptotech.server_tutor.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*@Configuration
@EnableTransactionManagement*/
/*@PropertySource(value = { "classpath:application.properties" })*/
public class HibernateConfig {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	String url =// "jdbc:mysql://" + "127.10.221.130" + ":" + "3306" + "/" + "basictutor";
			//"jdbc:mysql//mysql:3306/basictutor";
			"jdbc:mysql//sql11.freesqldatabase.com:3306/sql11199469";
	String user = "sql11199469";
	String password = "abveRCFyUM";
	//String user = "adminTVitrUP";
	//String password = "n-WzIMwcQDcQ";
	/*
	 * The following service(s) have been created in your project: mysql.

       Username: adminTVitrUP
       Password: n-WzIMwcQDcQ
  Database Name: basictutor
 Connection URL: mysql://mysql:3306/

For more information about using this template, including OpenShift considerations, see https://github.com/sclorg/mysql-container/blob/master/5.7/README.md.
	 */
	
	/*@Autowired
	private Environment env;*/

	/*@Bean(name = "sessionFactory")
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource());
		//builder.scanPackages("com.uptotech.server_tutor.model").addProperties(getHibernateProperties());
		return builder.buildSessionFactory();
	}

	/*private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
		return properties;
	}*/

/*	@Bean
	public HibernateTransactionManager txManager() {
		return new HibernateTransactionManager(sessionFactory());
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(JDBC_DRIVER);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		return dataSource;
	}*/

	/*
	 * @Override public PlatformTransactionManager
	 * annotationDrivenTransactionManager() { return txManager(); }
	 */

	/*
	 * @Bean
	 * 
	 * @Autowired public HibernateTransactionManager
	 * transactionManager(SessionFactory s) { HibernateTransactionManager
	 * txManager = new HibernateTransactionManager();
	 * txManager.setSessionFactory(s); return txManager; }
	 */
}