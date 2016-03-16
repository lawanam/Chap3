package com.Chapter3_Q2;

/**
 * Created by student on 2016/03/13.
 */
public interface Train_Inter {



    public void setGear(int newGear);
    public int getGear();
    public void gearUp(int increment);

    void setSpeed(int newSpeed);
    int  GetSpeed();
    void speedDown(int decrement );
}


