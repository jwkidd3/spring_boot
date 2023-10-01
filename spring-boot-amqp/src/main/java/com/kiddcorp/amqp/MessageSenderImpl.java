package com.kiddcorp.amqp;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kiddcorp.domain.Order;

@Component
public class MessageSenderImpl implements MessageSender {
	
	@Autowired
    private AmqpTemplate amqpTemplate=null;

}