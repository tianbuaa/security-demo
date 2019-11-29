/**
 * 
 */
package com.yisu.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyisu
 *
 */
@SpringBootApplication
@EnableOAuth2Sso
public class SsoClient2Application {
	

	public static void main(String[] args) {
		SpringApplication.run(SsoClient2Application.class, args);
	}
	
}
