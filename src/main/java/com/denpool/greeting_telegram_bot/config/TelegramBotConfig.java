package com.denpool.greeting_telegram_bot.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.yaml")
@Getter
public class TelegramBotConfig {

    @Value("${bot.name}")
    private String botName;

    @Value("${bot.api-key}")
    private String botApiToken;
}
