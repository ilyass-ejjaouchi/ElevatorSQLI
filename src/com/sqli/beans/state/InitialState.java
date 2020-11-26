package com.sqli.beans.state;

import com.sqli.beans.Elevator;

public class InitialState extends State {

    public InitialState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public int calculDistance(int numberOfFloors, int actualPosition) {
        return numberOfFloors - actualPosition;
    }

    @Override
    public void moving_down() {
        this.elevator.setState(new GoingDownState(this.elevator));
    }

    @Override
    public void moving_up() {
        this.elevator.setState(new GoingUpState(this.elevator));
    }

    @Override
    public void resting(){
        this.elevator.setState(new RestingState(this.elevator));
    }
}
