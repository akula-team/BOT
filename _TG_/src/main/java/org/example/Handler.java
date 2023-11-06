package org.example;

public class Handler implements MessageHandler {
    public void handle (BotRequest request, AnswerWriter writer) {
        BotResponse answer = new BotResponse(request.getRequestText());
        writer.writeAnswer(answer);
    }
}
