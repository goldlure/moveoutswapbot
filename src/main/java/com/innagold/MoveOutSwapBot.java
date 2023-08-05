package com.innagold;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

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
        Properties properties = new Properties();
        try {
            FileInputStream configFile = new FileInputStream("config.properties");
            properties.load(configFile);
            configFile.close();
            String botToken = properties.getProperty("bot_token");
            return botToken;
        } catch (IOException e) {
            System.err.println("Error reading configuration: " + e.getMessage());
        }
        return null;
    }

    @Override
    public String getBotUsername() {
        return "MoveOutSwapBot";
    }

    

}
