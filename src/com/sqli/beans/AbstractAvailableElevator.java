package com.sqli.beans;

import java.util.HashMap;

public abstract class AbstractAvailableElevator {
   public abstract String getIdOfFirstAvailableElevator(int floor, HashMap<String, Elevator> elevators);
}
