

package com.galvanize.springplayground;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolumeController {

    @GetMapping("/math/volume/{length}/{width}/{height}")
    public String getVolume(@PathVariable int length, @PathVariable int width, @PathVariable int height) {
        return "The volume of a " + length + "x" + width + "x" + height + " rectangle is " +(width * length * height);   
    }

}
