package com.innagold;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.innagold.utils.ConfigReader;

public class MoveOutSwapBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage().hasText()) {
            System.out.println(update.getMessage().getText());
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId());
            sendMessage.setText("Hi there!");
            try {
                execute(sendMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotToken() {
        ConfigReader configReader = new ConfigReader();
        String botToken = configReader.getProperty("bot_token");
        return botToken;
    }

    @Override
    public String getBotUsername() {
        return "MoveOutSwapBot";
    }

}
