package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetVolume {

    @GetMapping("/math/volume/{length}/{width}/{height}")
    public String getVolume(@PathVariable String length, @PathVariable String width,@PathVariable String height) {

        String volume=Integer.toString(Integer.parseInt(length)*Integer.parseInt(width)*Integer.parseInt(height));

        return "The volume of a "+length+"x"+width+"x"+height +"rectangle is"+volume ;
    }


}
