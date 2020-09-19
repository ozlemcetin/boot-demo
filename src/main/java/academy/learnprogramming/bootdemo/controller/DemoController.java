package academy.learnprogramming.bootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    /*
        We don't have to use the application name in the URL
        Spring Boot automatically configures those settings
     */

    //http://localhost:8080/demo-boot
    @GetMapping("demo-boot")
    @ResponseBody
    public String demo() {

        log.info("demo() called.");
        return "Demo project for Spring Boot!";
    }

    @GetMapping("welcome")
    public String welcome(Model model) {

        log.info("welcome() called.");
        model.addAttribute("welcomeMessage", "Welcome to Demo project for Spring Boot!");
        return "welcome";

    }
}
