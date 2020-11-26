package com.sqli.beans;

import java.util.HashMap;
import java.util.Iterator;

public class AvailableElevator extends AbstractAvailableElevator {

   private static AbstractAvailableElevator instance;

   public static AbstractAvailableElevator getInstance(){
      if (instance == null)
         return new AvailableElevator();
      return instance;
   }

   @Override
   public String getIdOfFirstAvailableElevator(int floor, HashMap<String, Elevator> elevators) {
      int minDistance = 20000;
      String idOfAvailableElevator = null;
      Iterator iterator = elevators.keySet().iterator();

      while (iterator.hasNext()) {
         String id = (String) iterator.next();
         int d = elevators.get(id).getState().calculDistance(floor,elevators.get(id).getCurrent_floor());
         if (d < minDistance ){
            minDistance = d;
            idOfAvailableElevator = id;
         }
      }

      return idOfAvailableElevator;
   }
}
