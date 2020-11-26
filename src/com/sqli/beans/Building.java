package com.sqli.beans;

import com.sqli.beans.state.GoingDownState;
import com.sqli.beans.state.GoingUpState;
import com.sqli.beans.state.RestingState;

import java.util.HashMap;

public class Building {

    private HashMap<String, Elevator> elevators;
    private ElevatorFactory elevatorFactory = ElevatorFactorySingleton.getInstance();
    private AbstractAvailableElevator availableElevator = AvailableElevator.getInstance();
    private int numberOfFloors;

    public Building(int numberOfFloors, String... params) {
        this.numberOfFloors = numberOfFloors;
        this.elevators = elevatorFactory.createElevators(params);
    }

    public String requestElevator() {
        return availableElevator.getIdOfFirstAvailableElevator(numberOfFloors,elevators);
    }
    public String requestElevator(int i) {
        return availableElevator.getIdOfFirstAvailableElevator(i,elevators);
    }
    public void move(String id, String order)  {
        switch (order){
            case configuration.ELEVATOR_MOVING_DOWN:
                elevators.get(id).getState().moving_down();
                break;
            case configuration.ELEVATOR_MOVING_UP:
                elevators.get(id).getState().moving_up();
                break;
        }
    }

    public void stopAt(String id, int i) {
        elevators.get(id).setCurrent_floor(i);
        elevators.get(id).getState().resting();
    }
}
