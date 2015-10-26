package test.io.xdire.jms.listener;

import io.xdire.jms.listener.ConsumerListener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.jms.TextMessage;

import static org.junit.Assert.*;

/**
 * Created by xdire on 26.10.15.
 */
public class ConsumerListenerTest {

    private TextMessage message;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testOnMessage() throws Exception {
        ConsumerListener listener = new ConsumerListener();
        listener.onMessage(message);
        assertNull(message);
    }
}