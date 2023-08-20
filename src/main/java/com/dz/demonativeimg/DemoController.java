package com.dz.demonativeimg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String getDemo() {
        return "Spring boot 3 with native image demo!";
    }

}
