

package com.galvanize.springplayground;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/math/calculate")
    public String postCalc(@RequestParam String operation, @RequestParam int x, @RequestParam int y) {

        int a = x;
        int b = y;
        switch (operation) {
            case "add":
                return x + " + " + y + " = " + Integer.toString(a + b);
            case "subtract":
                return x + " - " + y + " = " + Integer.toString(a - b);
            case "multiply":
                return x + " * " + y + " = " + Integer.toString(a * b);
            case "divide":
                return x + " / " + y + " = " + Integer.toString(a / b);
        }
		return "not a valid request";   
    }

}
