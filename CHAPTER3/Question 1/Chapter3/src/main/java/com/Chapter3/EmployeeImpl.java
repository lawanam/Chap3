package com.Chapter3;
import java.util.*;
/**
 * Created by student on 2016/03/13.
 */
public class EmployeeImpl implements Employee {
    public Collection<Object> empDetails() {
        Collection col = new HashSet();
        col.add("10001");

        return col;
    }

    public List<String> names() {
        List list = new ArrayList();
        list.add("Lawana Mzuvukile");
        list.add("Mgijima Siphiwo");
        list.add("Ketelo Asanda");


        return list;
    }
    public Map<String, String> levelOfEmp() {

        Map level = new HashMap();

        level.put("10001"," Level 6");
        level.put("10002"," Level 7");
        level.put("10003"," Level 8");

        return level;
    }
    public Set<String> empNumber() {

        Set set1 = new HashSet();

        set1.add("10001");
        set1.add("10002");
        set1.add("10003");
        return set1;
    }




}
