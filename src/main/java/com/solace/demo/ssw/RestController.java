package com.solace.demo.ssw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RestController {

    private static final Logger logger = LoggerFactory.getLogger(RestController.class); 
    
    @RequestMapping("/order")
    public void order(@RequestBody String body) {
      logger.info("Received Order #" + body);
    }
}