package com.Chapter3;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by student on 2016/03/13.
 */
public class EmployeeTest {
    Employee empRec;

    @Before
    public void setUp1() throws Exception {
        empRec = new EmployeeImpl();
    }

    @Test
    public void testEmpDetails() throws Exception {
        Collection col2 = new HashSet();
        col2.add("10001");

        Assert.assertEquals(empRec.empDetails(), col2);

    }

    @Test
    public void testName() throws Exception {

    }




    Employee emp;

    @Before
    public void setUp() throws Exception {
        emp = new EmployeeImpl();

    }

    @Test
    public void testNames() throws Exception {

        Assert.assertEquals(emp.names().get(0),emp.names().get(0));
    }

    @After
    public void tearDown() throws Exception {


    }
    Employee empLvl;

    @Before
    public void setUp2() throws Exception {
        empLvl = new EmployeeImpl();
    }

    @Test
    public void testLevelOfEmp() throws Exception {

        Assert.assertEquals(empLvl.levelOfEmp().get("10001"),empLvl.levelOfEmp().get("10001"));
    }

    @After
    public void tearDown2() throws Exception {


    }


    Employee empNum;

    @Before
    public void setUp3() throws Exception {
        empNum = new EmployeeImpl();

    }

    @Test
    public void testEmpNumber() throws Exception {
        Set<String> set2 = new HashSet<String>();
        set2.add("10001");
        set2.add("10002");
        set2.add("10003");

        Assert.assertEquals(empNum.empNumber(),set2);

    }

    @After
    public void tearDown3() throws Exception {


    }




}
