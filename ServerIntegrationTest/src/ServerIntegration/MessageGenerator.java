package ServerIntegration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwalker15
 */


public class MessageGenerator {
    
    private IHttpLib httpLib;
    
    public MessageGenerator(IHttpLib httpLib) {
        this.httpLib = httpLib;
    }
    public String generateMessage(String url) throws Exception {
        Response response = this.httpLib.call(url);
        if (response.getData().contains("morning")) {
            return "Morning message received: ’" + response.getData() + "’";
        } else if (response.getData().contains("afternoon")) {
            return "Afternoon message received: ’" + response.getData() + "’";
        } else if (response.getData().contains("evening")) {
            return "Out of hours message received - look in the morning";
        }
        return "Badly formatted message received";
    }
}
