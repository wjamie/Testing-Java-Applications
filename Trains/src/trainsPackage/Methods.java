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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Walker
 */
public class Methods implements IMethods{
    
    public static String getAllTrains(){
        ArrayList<Train> trainsArrayInstance = Populate();
       
        ArrayList<String> allTrainsStringList;
        allTrainsStringList = new ArrayList<String>();
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            
             try {
                 allTrainsStringList.add(trainsArrayInstance.get(i).getDeparts());
             } catch (Exception e) {
                 
             }
        }
        String returnAllTrainsString = "all trains: " + allTrainsStringList;
        return returnAllTrainsString;
     }
     
     
    public static String getTrainsAtPlatform(String platformQuery){
        ArrayList<Train> trainsArrayInstance = Populate();;
       
        ArrayList<String> trainsAtPlatformStringList;
        trainsAtPlatformStringList = new ArrayList<String>();
        
       
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            if(trainsArrayInstance.get(i).getPlatform().equals(platformQuery)) {
          
                try {
                    trainsAtPlatformStringList.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        
         
    
        }
        String returnPlatformString = "all trains at platform " + platformQuery + ": " + trainsAtPlatformStringList;
        return returnPlatformString;
    }
    
      public static String getLateTrains(){
        ArrayList<Train> trainsArrayInstance = Populate();;
       
        ArrayList<String> trainsLateStringList;
        trainsLateStringList = new ArrayList<String>();
        
       
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            if(trainsArrayInstance.get(i).getExpected() != null) {
          
                try {
                    trainsLateStringList.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        
         
    
        }
        String returnLateString = "all late trains: " + trainsLateStringList + "    Please be advised these trains are running late, plan your journey accordingly";
        return returnLateString;
    }
    
      
      
    
        public static String getTrainsAtStation(String stationQuery){
        ArrayList<Train> trainsArrayInstance = Populate();
        ArrayList<String> trainsAtStationStringList;
        trainsAtStationStringList = new ArrayList<String>();
        
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
                    trainsAtStationStringList.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        }
         String returnTrainsAtStationString = "all trains calling at " + stationQuery + ": " + trainsAtStationStringList;
         return returnTrainsAtStationString;
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
