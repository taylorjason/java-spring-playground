package com.galvanize.springplayground;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class AreaController {
    @PostMapping("/math/area")
    public String postArea(@RequestParam Map<String, String> body){
        switch(body.get("type")) {
            case "rectangle":
                if (body.get("width") == null || body.get("height") == null) {
                    return "Invalid";
                }
                return "Area of a " + body.get("width") +"x" + body.get("height") + " rectangle is " + (Integer.valueOf(body.get("width")) * Integer.valueOf(body.get("height")));
            case "circle":
                if (body.get("radius") == null) {
                    return "Invalid";
                }
                return "Area of a circle with a radius of " + body.get("radius") + " is " + (Math.pow(Integer.valueOf(body.get("radius")),2) * Math.PI);
            default:
                return "Invalid";
        }   
    }
}