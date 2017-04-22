package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by singh on 4/22/2017.
 */

@RestController
public class GetMathPiValue {


    @GetMapping("/math/pi")
    public String getValue() {
        return "3.141592653589793";
    }
}
