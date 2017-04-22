package com.example;

/**
 * Created by singh on 4/22/2017.
 */
public class MathService {

    public static String getResult(String operation,String x,String y){
        if(operation.equalsIgnoreCase("add")) {
            return Integer.toString(Integer.parseInt(x) + Integer.parseInt(y));
        }
        if(operation.equalsIgnoreCase("subtract")) {
            return Integer.toString(Integer.parseInt(x) - Integer.parseInt(y));
        }
        if(operation.equalsIgnoreCase("multiply")) {
            return Integer.toString(Integer.parseInt(x) * Integer.parseInt(y));
        }
        if(operation.equalsIgnoreCase("divide")) {
            return Integer.toString(Integer.parseInt(x) / Integer.parseInt(y));
        }

        return "NoResult";
    }


}
