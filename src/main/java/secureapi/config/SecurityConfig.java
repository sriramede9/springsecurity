package secureapi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource securityDataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add users for inmemory authentication

//		UserBuilder users = User.withDefaultPasswordEncoder();
//
//		auth.inMemoryAuthentication().withUser(users.username("john").password("test").roles("EMPLOYEE"))
//				.withUser(users.username("mary").password("test").roles("EMPLOYEE", "MANAGER"))
//				.withUser(users.username("susan").password("test").roles("EMPLOYEE", "ADMIN"));
		auth.jdbcAuthentication().dataSource(securityDataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub

		http.authorizeRequests().antMatchers("/").hasRole("EMPLOYEE").antMatchers("/leaders/**").hasRole("MANAGER")
				.antMatchers("/systems/**").hasRole("ADMIN")

				.and().formLogin().loginPage("/showLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll()
				.and().logout().permitAll();

	}

}
