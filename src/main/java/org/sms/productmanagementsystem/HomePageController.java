package org.sms.productmanagementsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String displayHomePage() {
        return "index";
    }
}
