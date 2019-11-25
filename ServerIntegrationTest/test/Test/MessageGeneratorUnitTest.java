package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ServerIntegration.IHttpLib;
import ServerIntegration.MessageGenerator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author jwalker15
 */
public class MessageGeneratorUnitTest {
    
    @Test
    public void testGeneratedMessage() throws Exception {
        IHttpLib httpLib = new MockHttpLib(9);
        MessageGenerator generator = new MessageGenerator(httpLib);
        String msg = generator.generateMessage("http://localhost:9000/?personName=David");
        assertEquals("Wrong msg received", "Morning message received: ’Good morning David’", msg);

        httpLib = new MockHttpLib(14);
        generator = new MessageGenerator(httpLib);
        msg = generator.generateMessage("http://localhost:9000/?personName=David");
        assertEquals("Wrong msg received", "Afternoon message received: ’Good afternoon David’", msg);

        httpLib = new MockHttpLib(21);
        generator = new MessageGenerator(httpLib);
        msg = generator.generateMessage("http://localhost:9000/?personName=David");
        assertEquals("Wrong msg received", "Out of hours message received - look in the morning", msg);
        
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
