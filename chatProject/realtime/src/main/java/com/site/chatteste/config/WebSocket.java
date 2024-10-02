package com.site.chatteste.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocket implements WebSocketMessageBrokerConfigurer{

    @SuppressWarnings("null")
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/canal");
        config.setApplicationDestinationPrefixes("/app");
	}

    @SuppressWarnings("null")
    @Override
    public void registerStompEndpoints(StompEndpointRegistry config) {
        config.addEndpoint("conect");
        config.addEndpoint("conect").withSockJS();
	}
}
