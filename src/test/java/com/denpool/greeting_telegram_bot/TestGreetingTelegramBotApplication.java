package com.denpool.greeting_telegram_bot;

import org.springframework.boot.SpringApplication;

public class TestGreetingTelegramBotApplication {

	public static void main(String[] args) {
		SpringApplication.from(GreetingTelegramBotApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
