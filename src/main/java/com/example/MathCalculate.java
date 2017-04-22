package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by singh on 4/22/2017.
 */
@RestController
public class MathCalculate {

    @GetMapping("/math/calculate")
    public String calculate(
            @RequestParam(required= false, defaultValue = "false",name = "operation") String operation,
            @RequestParam(required= true, defaultValue = "4",name="x") String x,
            @RequestParam(required= true, defaultValue = "2",name="y") String y) {


       return MathService.getResult(operation,x,y);


    }

    @GetMapping("/math/sum")
    public String sum(
            @RequestParam(required= true,name = "n") String[] n) {
            return Integer.toString(Integer.parseInt(n[0]) + Integer.parseInt(n[1])+Integer.parseInt(n[2]));
    }


}
