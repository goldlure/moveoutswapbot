package com.innagold;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.innagold.utils.ConfigReader;
import com.innagold.utils.StringInputHandler;

public class MoveOutSwapBot extends TelegramLongPollingBot {
    private static final Logger logger = LogManager.getLogger(MoveOutSwapBot.class);
    @Override
    public void onUpdateReceived(Update update) {
        
        if (update.getMessage().hasText()) {
            String input = update.getMessage().getText();
            StringInputHandler handler = null;
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId());
            try {
                System.out.println(input);
                handler = InputMapper.inputMapping.getHandler(input);
                if (handler == null) handler = InputMapper.inputMapping.setDefaultHandler();
                sendMessage.setText(handler.handleInput(input));
            } catch (Exception exception) {
                logger.error("Can't create handler for input mapper: " + exception.getMessage());
                throw exception;
            }       
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
