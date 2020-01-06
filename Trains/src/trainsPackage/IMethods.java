/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsPackage;

import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public interface IMethods {
    
    // returns ALL trains in the data as a String
    
 public static String getAllTrains(){
     String trains = "interface method";
       return trains;
 };
 
 // returns ONLY trains at selected platform as String
 public  static String getTrainsAtPlatform(String platformQuery){
     String trains = "interface method";
       return trains;
 };
 
 // returns ONLY trains with an EXPECTED value as the are LATE as a String
 public static String getLateTrains(){
     String trains = "interface method";
       return trains;
 };
 
  // returns ONLY trains calling at a selected station as String
 public static String getTrainsAtStation(String stationQuery){
     String trains = "interface method";
       return trains;
 };
 
  // Gets the JSON data and turns in into an array of trains, each train contains an array of stops. returns the array of trains
 public static ArrayList<Train> Populate(){
     ArrayList<Train> trains = null;
       return trains;
 };
}
