package com.sqli.beans;


import java.util.HashMap;

public class ElevatorFactorySingleton extends ElevatorFactory {
    private HashMap<String, Elevator> elevators = new HashMap<>();

    private static ElevatorFactorySingleton instance;

    public static ElevatorFactorySingleton getInstance(){
        if (instance == null)
            instance = new ElevatorFactorySingleton();
        return instance;
    }

    @Override
    public HashMap<String, Elevator> createElevators(String ...params) {
        for (String elevator: params){
            String[] elevatorInfo = elevator.split(":");
            String id = elevatorInfo[0];
            int current_floor = Integer.parseInt(elevatorInfo[1]);
            elevators.put(id,new Elevator(id,current_floor));
        }
        return elevators;
    }
}
