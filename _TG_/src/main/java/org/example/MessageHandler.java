package org.example;

public interface MessageHandler {
    void handle(BotRequest request, AnswerWriter writer);
}
