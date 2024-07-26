package com.denpool.greeting_telegram_bot.event_handler;

import com.denpool.greeting_telegram_bot.config.TelegramBotConfig;
import dev.langchain4j.model.chat.ChatLanguageModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import sendinblue.ApiException;
import sibApi.SendersApi;
import sibApi.TransactionalEmailsApi;
import sibModel.*;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TelegramEventHandler extends TelegramLongPollingBot {

        private final TelegramBotConfig config;
        private final ChatLanguageModel model;
        private final TransactionalEmailsApi mailSender;

        @Override
        public void onUpdateReceived(Update update) {

                if (update.hasMessage() && update.getMessage().hasText()) {

                }
        }

        @Override
        public String getBotUsername() {
                return config.getBotName();
        }

        @Override
        public String getBotToken() {
                return config.getBotApiToken();
        }
}
