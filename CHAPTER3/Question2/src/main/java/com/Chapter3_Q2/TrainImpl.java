package com.Chapter3_Q2;

/**
 * Created by student on 2016/03/13.
 */
public class TrainImpl implements Train_Inter{
    int gear;
    int speed;
    public void setGear(int newGear) {
        gear = newGear;
    }


    public int getGear() {
        return gear;
    }


    public void gearUp(int increment) {
        gear += increment;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }


    public int GetSpeed() {
        return speed;
    }


    public void speedDown(int decrement) {
        speed -=decrement;
    }
}
