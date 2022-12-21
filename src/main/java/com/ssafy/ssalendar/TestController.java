package com.ssafy.ssalendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
//@RequestMapping("/")
public class TestController {

    @GetMapping()
    public ResponseEntity<String> getTest(){
        return new ResponseEntity<>("안녕하세요", HttpStatus.OK);
    }
}
