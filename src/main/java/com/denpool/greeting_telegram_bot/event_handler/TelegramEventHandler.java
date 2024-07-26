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
//                        String senderEmail = "den.dyrbalov25@gmail.com";
//                        String recipientEmail = "den.dyrbalov25@gmail.com";
//                        String senderName = "Denys";
//                        Long templateId = 4L;
//                        Object params = new GreetingParams(
//                                "Dear Dania",
//                                "Happy Bithday",
//                                "You are cool",
//                                "Best Regards",
//                                "Denys");
//
//
//                        TransactionalEmailsApi apiInstance = new TransactionalEmailsApi();
//                        SendSmtpEmail sendSmtpEmail = new SendSmtpEmail(); // SendSmtpEmail | Values to send a transactional email
//                        sendSmtpEmail.setTemplateId(templateId);
//                        sendSmtpEmail.setParams(params);
//                        sendSmtpEmail.setSender(new SendSmtpEmailSender().email(senderEmail).name(senderName));
//                        sendSmtpEmail.setTo(List.of(new SendSmtpEmailTo().email(recipientEmail)));
//                        try {
//                                CreateSmtpEmail result = apiInstance.sendTransacEmail(sendSmtpEmail);
//                                System.out.println(result);
//                        } catch (ApiException e) {
//                                System.err.println("Exception when calling TransactionalEmailsApi#sendTransacEmail");
//                                e.printStackTrace();
//                        }
//            long chatId = update.getMessage().getChatId();
//            SendMessage message = new SendMessage();
//            message.setChatId(chatId);
//            message.setText(model.generate(update.getMessage().getText()));
//            try {
//                execute(message);
//            } catch (TelegramApiException e) {
//                throw new RuntimeException(e);
//            }
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
