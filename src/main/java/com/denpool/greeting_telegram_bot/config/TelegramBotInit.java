package com.denpool.greeting_telegram_bot.config;

import com.denpool.greeting_telegram_bot.event_handler.TelegramEventHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
@RequiredArgsConstructor
public class TelegramBotInit {

    private final TelegramEventHandler telegramEventHandler;

    @EventListener({ContextRefreshedEvent.class})
    public void init() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(
                DefaultBotSession.class
        );
        try {
            telegramBotsApi.registerBot(telegramEventHandler);
        } catch (TelegramApiException e) {
            throw new RuntimeException();
        }
    }

}
