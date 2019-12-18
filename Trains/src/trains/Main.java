/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;



public class Main {
    
	public static void main(String[] args) 
        {
          String jsonString = "";
          String jsonStringRetrieved = "";
		// TODO Auto-generated method stub
                try 
                {
			URL url = new URL("http://web.socem.plymouth.ac.uk/david/trains.json");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while (null != (jsonString = br.readLine()))
                        {
                            
			       System.out.println(jsonString);
                               jsonStringRetrieved = jsonString;
                              
                        }
                } catch (Exception ex)
                {
			ex.printStackTrace();
                }

                 //  JSONParser parser = new JSONParser();
                  JSONArray jsonArr = new JSONArray(jsonStringRetrieved);
                
                try 
                {
                    for(int i=0; i<jsonArr.length(); i++){
                      JSONObject obj = jsonArr.getJSONObject(i);

                      String platform = obj.getString("platform");
                      String departs = obj.getString("departs");
                      
                      
                      try
                      {
                          
                             String expected = obj.getString("expected");
                             System.out.println(expected);
                      }
                      catch (Exception noExpected)
                {
			
                }
                      
                    //  String arrives = obj2.getString("arrives");

                      System.out.println(platform);
                      System.out.println(departs);
                      //System.out.println(expected);
                     // System.out.println(arrives);
}
              //ArrayList arr = (ArrayList) parser.parse(jsonStringRetrieved);
              //JSONArray trainsArray = (JSONArray)arr.get("")
              //JSONObject trainsArray = (JSONObject) jsonObj.get("stops");
                
                } catch (Exception ex)
                {
			ex.printStackTrace();
                }
      
     
          
   

        }
}
   


                
                
                
                

        
                    
                    
                    
                    
                    
          //  Gson gson = new GsonBuilder().create();
            
         //   Train trainExample = gson.fromJson(jsonStringRetrieved, Train.class);

        // Show it.
       // System.out.println(trainExample.toString());
        
       



               
                
	
        

  // String url = "http://web.socem.plymouth.ac.uk/david/trains.json";
       
   //   String jsonContent = JsonGetter.getJsonContent(url);
       
    //  System.out.println(jsonContent);
        