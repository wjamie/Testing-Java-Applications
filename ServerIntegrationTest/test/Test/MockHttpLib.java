package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ServerIntegration.IHttpLib;
import ServerIntegration.Response;

/**
 *
 * @author jwalker15
 */
public class MockHttpLib implements IHttpLib {
    
    private int hours;
    public MockHttpLib(int hours) {
        this.hours = hours;
    }
    public Response call(String url) throws Exception {
        String name = url.substring(url.indexOf("=")+1);
        if (hours < 12) {
            return new Response(200, "Good morning " + name);
        } else if (hours < 18) {
            return new Response(200, "Good afternoon " + name);
        } else {
            return new Response(200, "Good evening " + name);
        }
    }
}
