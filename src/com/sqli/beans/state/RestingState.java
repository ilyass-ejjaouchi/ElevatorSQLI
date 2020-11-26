package com.sqli.beans.state;

import com.sqli.beans.Elevator;

public class RestingState extends State {

    public RestingState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public int calculDistance(int numberOfFloors, int actualPosition) {
        return 3*numberOfFloors;
    }

    @Override
    public void moving_down()  {
        throw new IllegalStateException("can't moving");
    }

    @Override
    public void moving_up() {
        throw new IllegalStateException("can't moving");
    }

    @Override
    public void resting() {
        throw new IllegalStateException("can't moving");
    }
}
