package org.example.Service;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBotService extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "Muharram1989bot_bot";
    }

    @Override
    public String getBotToken() {
        return "6302370489:AAEMT7wL0UTJ9rrTEZkQtK7H2jTVanPGoGQ";
    }
}
