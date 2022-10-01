//package com.telegrambot.handler;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//@MessageHandler
//public class MessageHandler {
//
//    @Autowired
//    private TelegramBotApi telegramBotApi;
//
//    @MessageMapping(text = "/me")
//    public MessageResponse getMe(UpdateEvent updateEvent) {
//        User me = telegramBotApi.getMe().get();
//
//        return sendMessage("Me is : " + me.getFirstName() + " " + me.getLastName(), updateEvent);
//    }
//}