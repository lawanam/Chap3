package com.Chapter3_Q2;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by student on 2016/03/13.
 */
public class TrainTest {

    Train_Inter train;

    @Before
    public void setUp() throws Exception {
        train = new TrainImpl();
    }

    @Test
    public void testName() throws Exception {

    }

    @Test
    public void testTrainGear() throws Exception {

        train.setGear(5);
        int trainGear1 = train.getGear();
        train.gearUp(1);
        int trainGear2 = train.getGear();

        Assert.assertEquals(trainGear1+1 , trainGear2 );
    }

}
