package com.sqli.beans;

import com.sqli.beans.state.InitialState;
import com.sqli.beans.state.State;

public class Elevator {
    private State state = new InitialState(this);

    private String id;
    private int current_floor;
    private boolean isAvailable;

    public Elevator(String id, int current_floor) {
        this.id = id;
        this.current_floor = current_floor;
    }

    public Elevator() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrent_floor() {
        return current_floor;
    }

    public void setCurrent_floor(int current_floor) {
        this.current_floor = current_floor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "state=" + state +
                ", id='" + id + '\'' +
                ", current_floor='" + current_floor + '\'' +
                '}';
    }

}
