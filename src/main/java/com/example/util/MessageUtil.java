package com.example.util;

import java.util.Locale;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

    private static MessageSource messagesource;

    @Autowired
    private MessageSource msgSource;

	@PostConstruct
	private void init() {
		MessageUtil.messagesource = msgSource;
	}


	/**
	 * messages.propertiesから該当するメッセージを取得する
	 * @param messageId メッセージID
	 * @param args メッセージの引数
	 * @return メッセージID：本文
	 */
	public static String getMessage(String messageId,Object...args) {

		return messageId + "：" + MessageUtil.messagesource.getMessage(messageId, args, Locale.getDefault());

	}

	/**
	 * messages.propertiesから該当するメッセージを取得する
	 * @param messageId メッセージID
	 * @return メッセージID：本文
	 */
	public static String getMessage(String messageId) {

		return messageId + "：" + MessageUtil.messagesource.getMessage(messageId, null, Locale.getDefault());
	}
}
