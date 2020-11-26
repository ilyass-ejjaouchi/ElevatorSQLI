package com.sqli.beans.state;

import com.sqli.beans.Elevator;

public  abstract class State {

    protected Elevator elevator;

    public State(Elevator elevator) {
        this.elevator = elevator;
    }

    public abstract  int calculDistance(int numberOfFloors, int actualPosition);
    public abstract void moving_down() ;
    public abstract void moving_up() ;
    public abstract void resting() ;
}
