/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ServerIntegration.HttpLib;
import ServerIntegration.IHttpLib;
import ServerIntegration.MessageGenerator;
import java.time.LocalDateTime;
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
public class MessageGeneratorIntegrationTest {
    
    @Test
    public void testGeneratedMessage() throws Exception {
        IHttpLib httpLib = new HttpLib();
        MessageGenerator generator = new MessageGenerator(httpLib);
        String msg = generator.generateMessage("http://localhost:9000/?personName=David");
        int hours = LocalDateTime.now().getHour();
        if (hours < 12) {
            assertEquals("Wrong msg received", "Morning message received: ’Good morning David’", msg);
        } else if (hours < 18) {
            assertEquals("Wrong msg received", "Afternoon message received: ’Good afternoon David’", msg);
        } else {
            assertEquals("Wrong msg received", "Out of hours message received - look in the morning", msg);
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
