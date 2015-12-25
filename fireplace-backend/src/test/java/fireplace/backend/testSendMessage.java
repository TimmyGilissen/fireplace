package fireplace.backend;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class testSendMessage {

    @Autowired
    private AmqpAdmin admin;

    @Autowired
    private AmqpTemplate template;

    @Test
    public void simpleProducerConsumerTest() {
        try {
            String sent = "Catch the rabbit! " + new Date();
            admin.declareQueue( new Queue("test.queue") );

            // write message
            template.convertAndSend( sent );
            // read message
            String received = (String)template.receiveAndConvert();

            System.out.println( "Msg: " + received );
            Assert.assertEquals( sent, received );

        } catch (AmqpException e) {
            Assert.fail( "Test failed: " + e.getLocalizedMessage() );
        }
    }
}
