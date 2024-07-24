package com.denpool.greeting_telegram_bot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class GreetingTelegramBotApplicationTests {

	@Test
	void contextLoads() {
	}

}
