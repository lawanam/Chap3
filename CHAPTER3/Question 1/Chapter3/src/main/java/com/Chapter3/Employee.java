package com.Chapter3;
import java.util.*;

/**
 * Created by student on 2016/03/13.
 */
public interface Employee {

    Collection<Object> empDetails();
    List<String> names();
    Map<String,String> levelOfEmp();
    Set<String> empNumber();


}
