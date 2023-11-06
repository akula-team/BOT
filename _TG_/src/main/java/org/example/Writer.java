package org.example;

public class Writer implements AnswerWriter {
    public void writeAnswer(BotResponse response) {
        System.out.println(response.getResponseText());
    }
}