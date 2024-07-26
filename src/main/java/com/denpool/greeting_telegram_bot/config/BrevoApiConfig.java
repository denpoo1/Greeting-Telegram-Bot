/**
 * Created by Denys Durbalov
 * Date of creation: 7/26/24
 * Project name: greeting_telegram_bot
 * email: den.dyrbalov25@gmail.com or s28680@pjwstk.edu.pl
 */

package com.denpool.greeting_telegram_bot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sendinblue.ApiClient;
import sendinblue.auth.ApiKeyAuth;
import sibApi.TransactionalEmailsApi;

@Configuration
public class BrevoApiConfig {

        @Value("${brevo.api-key}")
        private String clientSecret;

        @Bean
        public TransactionalEmailsApi brevoApiKey() {
                ApiClient defaultClient = sendinblue.Configuration.getDefaultApiClient();
                ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
                apiKey.setApiKey(clientSecret);
                return new TransactionalEmailsApi();
        }
}
