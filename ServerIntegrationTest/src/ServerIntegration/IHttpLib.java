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
public interface IHttpLib {
    
    public Response call(String url) throws Exception;
    
}
