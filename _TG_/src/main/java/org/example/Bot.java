package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    // создаем две константы, присваиваем им значения токена и имя бота соответственно
    private static final String BOT_TOKEN = "6542589466:AAGSazbfXLObjgKPRhCDboBQJUCJNqvxNpM";
    private static final String BOT_NAME = "@PolyaTheMostBeautifulbot";

    Bot() {
    }

    public String getBotToken() {
        return BOT_TOKEN;
    }

    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            String messageText = message.getText();
            String chatId = message.getChatId().toString();

            // генерируем ответ
            String response = messageText;
            //Создаем объект класса SendMessage - наш будущий ответ пользователю
            SendMessage outMessage = new SendMessage();

            // Добавляем в наше сообщение id чата и ответ
            outMessage.setChatId(chatId);
            outMessage.setText(response);

            // Отправка в чат
            try {
                execute(outMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
    //    public String parseMessage(String textMsg) {
//        String response;
//
//        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
//        if(textMsg.equals("/start"))
//            response = "Приветствую, бот знает много цитат. Жми /get, чтобы получить случайную из них";
//        else if(textMsg.equals("/get"))
//            response = storage.getRandQuote();
//        else
//            response = "Сообщение не распознано";
//
//        return response;
//    }

}
