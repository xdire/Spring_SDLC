package io.xdire.jms.listener;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by xdire on 26.10.15.
 */

@Component
public class ConsumerListener implements MessageListener {

    public void onMessage(Message message) {
        System.out.println("In onMessage()");
    }

}
