package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig  extends AbstractWebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry arg0) {
		//注册STOMP协议节点并映射指定URL,使用SockJS协议
		arg0.addEndpoint("/endpointWisely").withSockJS();
	}
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
//		super.configureMessageBroker(registry);
		//配置一个广播式/topic消息代理
		registry.enableSimpleBroker("/topic");
	}
	

}
