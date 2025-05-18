package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class Controller {

//    @GetMapping("/ping")
//    public String ping() {
//        return "ping => pong from API/V1 Controller (PFE) ";
//    }
@GetMapping("/ping")
public String ping() {
    String podName = System.getenv("POD_NAME");
    return "ping => pong from API/V1 Controller (PFE) | Pod: " + podName;
}

}
