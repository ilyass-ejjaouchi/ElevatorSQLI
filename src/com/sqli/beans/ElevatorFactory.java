package com.sqli.beans;

import java.util.HashMap;

public abstract class ElevatorFactory {

    public abstract HashMap<String, Elevator> createElevators(String ...params);
}
