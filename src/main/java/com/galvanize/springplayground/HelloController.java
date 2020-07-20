package com.galvanize.springplayground;


        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/math/pi")
    public String getPi() {
        return "3.141592653589793";
    }

}
