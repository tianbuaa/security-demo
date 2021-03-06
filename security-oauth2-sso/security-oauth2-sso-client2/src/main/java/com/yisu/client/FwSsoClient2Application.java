/**
 * 
 */
package com.yisu.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author xuyisu
 *
 */
@SpringBootApplication
@EnableOAuth2Sso
public class FwSsoClient2Application {
	

	public static void main(String[] args) {
		SpringApplication.run(FwSsoClient2Application.class, args);
	}
	
}
