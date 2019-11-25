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
public class Response {
    
    private int code;
    private String data;
    
    public Response(int code, String data) {
        this.code = code;
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    public String getData() {
        return data;
    }

    
}
