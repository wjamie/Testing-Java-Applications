/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsPackage;
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

    public static void main(String[] args) {
        ArrayList<Train> trainsArrayInstance;
        trainsArrayInstance = Populate();
        
        String platform1 = "1";
        String station1 = "Totnes";
        
        getAllTrains();
        getTrainsAtPlatform(platform1);
        getTrainsAtStation(station1);
        getLateTrains();
        
        
        System.out.println("all trains:  " + getAllTrains());
        System.out.println("");
        
        System.out.println("all trains at platform " + platform1 +":  "+ getTrainsAtPlatform(platform1));
        System.out.println("all trains at platform " + 2 +":  "+ getTrainsAtPlatform("2"));
        System.out.println("all trains at platform " + 2 +":  "+ getTrainsAtPlatform("3"));
        System.out.println("");
        
        System.out.println("all trains calling at Totnes: " + getTrainsAtStation("Totnes"));
        System.out.println("all calling trains at Exeter St Davids: " + getTrainsAtStation("Exeter St Davids"));
        System.out.println("all calling trains at Ivybridge: " + getTrainsAtStation("Ivybridge"));
        System.out.println("");
        
        System.out.println("all late trains: " + getLateTrains());
      
    }
    
    
     public static ArrayList<String> getAllTrains(){
        ArrayList<Train> trainsArrayInstance = Populate();
       
        ArrayList<String> allTrainsString;
        allTrainsString = new ArrayList<String>();
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            
             try {
                 allTrainsString.add(trainsArrayInstance.get(i).getDeparts());
             } catch (Exception e) {
                 
             }
        }
        return allTrainsString;
     }
     
     
    public static ArrayList<String> getTrainsAtPlatform(String platformQuery){
        ArrayList<Train> trainsArrayInstance = Populate();;
       
        ArrayList<String> trainsAtPlatformString;
        trainsAtPlatformString = new ArrayList<String>();
        
       
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            if(trainsArrayInstance.get(i).getPlatform().equals(platformQuery)) {
          
                try {
                    trainsAtPlatformString.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        
         
    
        }
         return trainsAtPlatformString;
    }
    
      public static ArrayList<String> getLateTrains(){
        ArrayList<Train> trainsArrayInstance = Populate();;
       
        ArrayList<String> trainsLateString;
        trainsLateString = new ArrayList<String>();
        
       
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            if(trainsArrayInstance.get(i).getExpected() != null) {
          
                try {
                    trainsLateString.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        
         
    
        }
         return trainsLateString;
    }
    
      
      
    
        public static ArrayList<String> getTrainsAtStation(String stationQuery){
        ArrayList<Train> trainsArrayInstance = Populate();
        ArrayList<String> trainsAtStationString;
        trainsAtStationString = new ArrayList<String>();
        
         ArrayList<Stop> stopsArrayInstance = new ArrayList<Stop>(); 
        
        
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            trainsArrayInstance.get(i).getStops();
            stopsArrayInstance = (ArrayList<Stop>) trainsArrayInstance.get(i).getStops();
            ArrayList<String> stationNamesList = new ArrayList<String>(); 
           
            
            for (int j = 0; j < stopsArrayInstance.size(); j++) {
                stationNamesList.add( stopsArrayInstance.get(j).getName());
            }
            
            if(stationNamesList.contains(stationQuery)) {
                
                try {
                    trainsAtStationString.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        }
         return trainsAtStationString;
    }
    
    
    
    
    
    
    
    
    
    
    public static ArrayList<Train> Populate() {
        
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
                     // System.out.println("Train departs at: " + trainDeparts);
                     // System.out.println("platform: " + platform);
                      
                      for(int j=0; j<stops.length(); j++){
                          JSONObject stopsObj = stops.getJSONObject(j);
                          
                          String name = stopsObj.getString("name");
                          String arrives = stopsObj.getString("arrives");
                         // System.out.println("Train Station: " + name);
                        //  System.out.println("Arrives: " + arrives);
                          
                          try
                          {
                                 String stopDeparts = stopsObj.getString("departs");
                              //   System.out.println("Departs stop at: " + stopDeparts);
                                
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
                       //   System.out.println("expected: " + expected);
                             
                          Train newTrain = new Train(platform, trainDeparts, expected ,stopsArray);
                          trainsArray.add(newTrain);
                             
                       //   System.out.println("This train is running a little later than expected, sorry for the delay!");
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
    
    return trainsArray;
    }
    
   
}
   
        