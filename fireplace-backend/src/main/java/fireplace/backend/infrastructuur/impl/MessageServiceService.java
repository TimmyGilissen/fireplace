package fireplace.backend.infrastructuur.impl;

import fireplace.backend.infrastructuur.MessageService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceService implements MessageService {

    @Autowired
    private AmqpAdmin admin;

    @Autowired
    private AmqpTemplate template;

    @Override
    public void sendMessage(String message) {
        try {
            admin.declareQueue( new Queue("fireplace") );

            // write message
            template.convertAndSend( message );

        } catch (AmqpException e) {
           throw e;
        }
    }
}
