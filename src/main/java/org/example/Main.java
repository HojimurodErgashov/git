package org.example;

import org.example.model.Course;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main extends TelegramLongPollingBot{
    public static void main(String[] args){
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Main());
        } catch (TelegramApiException e) {
            System.out.println(e);
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        String msg = "";
        Message message = update.getMessage();
        if(message.hasText()){
            if(message.getText().equals("/start")){

            }
        }else {
            msg = "Xato!";
        }
    }

    @Override
    public String getBotUsername() {
        return "@Muharram1989bot_bot";
    }

    @Override
    public String getBotToken() {
        return "6302370489:AAEMT7wL0UTJ9rrTEZkQtK7H2jTVanPGoGQ";
    }
    public InlineKeyboardMarkup inBtnAU(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardMarkup>>
    }
}