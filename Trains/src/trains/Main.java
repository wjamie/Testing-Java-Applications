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
import com.sun.corba.se.impl.logging.ORBUtilSystemException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;



public class Main {
    
	public static void main(String[] args) 
        {
          
          ArrayList<Train> trainsArray = new ArrayList<Train>();
          
          String jsonString = "";
          String jsonStringRetrieved = "";
         
		
                try 
                {
			URL url = new URL("http://web.socem.plymouth.ac.uk/david/trains.json");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while (null != (jsonString = br.readLine()))
                        {
                            jsonStringRetrieved = jsonString;
                        }
                } catch (Exception ex)
                {
			ex.printStackTrace();
                }
                
                JSONArray jsonArr = new JSONArray(jsonStringRetrieved);
                
                try 
                {
                    for(int i=0; i<jsonArr.length(); i++){
                      ArrayList<Stop> stopsArray = new ArrayList<Stop>(); 
                      
                      JSONObject obj = jsonArr.getJSONObject(i);
                      JSONArray stops = (JSONArray) obj.get("stops");
                      
                      String trainDeparts = obj.getString("departs");
                      String platform = obj.getString("platform");
                      System.out.println("Train departs at: " + trainDeparts);
                      System.out.println("platform: " + platform);
                      
                      for(int j=0; j<stops.length(); j++){
                          JSONObject stopsObj = stops.getJSONObject(j);
                          
                          String name = stopsObj.getString("name");
                          String arrives = stopsObj.getString("arrives");
                          System.out.println("Train Station: " + name);
                          System.out.println("Arrives: " + arrives);
                          
                          try
                          {
                                 String stopDeparts = stopsObj.getString("departs");
                                 System.out.println("Departs stop at: " + stopDeparts);
                                
                                 Stop newStop = new Stop(name, arrives, stopDeparts);
                                 stopsArray.add(newStop);
                          }
                          catch (Exception noDeparts)
                          {
                                 Stop newStop = new Stop(name, arrives);
                                 stopsArray.add(newStop);
                          }
                      }
                      
                      try
                      {
                          String expected = obj.getString("expected");
                          System.out.println("expected: " + expected);
                             
                          Train newTrain = new Train(platform, trainDeparts, expected ,stopsArray);
                          trainsArray.add(newTrain);
                             
                          System.out.println("This train is running a little later than expected, sorry for the delay!");
                      }
                      catch (Exception noExpected)
                      {
			Train newTrain = new Train(platform, trainDeparts, stopsArray);
                        trainsArray.add(newTrain);
                      }
                    }
                
                } catch (Exception ex)
                {
			ex.printStackTrace();
                }
      
     
          
   
            System.out.println("..."
                    + "done");
        }
}
   
        