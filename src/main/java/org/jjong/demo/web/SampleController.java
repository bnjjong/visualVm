package org.jjong.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/addNums")
    public String addNums(@RequestParam("loopCnt") int loopCnt) {
        if (loopCnt > 100000) {
            return "number is not over than 100,000";
        }
        long result = 0;
        for (int i=0; i<loopCnt; i++) {
            result += i;
        }
        return String.valueOf(result);
    }

    @GetMapping("/addText")
    public String addRandomString(@RequestParam("loopCnt") int loopCnt) {
        String result = "";
        for (int i=0; i<loopCnt; i++) {
            char c = (char) ((Math.random() * 26) + 65);
            result += String.valueOf(c);
        }
        return result;
    }
}
