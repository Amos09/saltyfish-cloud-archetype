package com.saltyfish.server.config;

import com.saltyfish.client.constant.ApiConstants;
import com.saltyfish.framework.security.config.AuthorizeRequestsCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * System 模块的 Security 配置
 */
@Configuration(proxyBeanMethods = false, value = "SecurityConfiguration")
public class SecurityConfiguration {

	@Bean("authorizeRequestsCustomizer")
	public AuthorizeRequestsCustomizer authorizeRequestsCustomizer() {
		return new AuthorizeRequestsCustomizer() {

			@Override
			public void customize(
					ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry) {
				// Swagger 接口文档
				registry.antMatchers("/v3/api-docs/**")
					.permitAll() // 元数据
					.antMatchers("/swagger-ui.html")
					.permitAll(); // Swagger UI
				// Spring Boot Actuator 的安全配置
				registry.antMatchers("/actuator").anonymous().antMatchers("/actuator/**").anonymous();
				// Druid 监控
				registry.antMatchers("/druid/**").anonymous();
				// RPC 服务的安全配置
				registry.antMatchers(ApiConstants.PREFIX + "/**").permitAll();
			}

		};
	}

}
