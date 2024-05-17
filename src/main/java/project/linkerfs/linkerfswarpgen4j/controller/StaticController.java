package project.linkerfs.linkerfswarpgen4j.controller;

import com.github.xiaoymin.knife4j.annotations.Ignore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Ignore
@Controller

public class StaticController {
    //  /{path:^(?!api)(?!swagger-ui)[^\\.]*}/**
    //@RequestMapping(value = "/{path:^(?!api)(?!swagger-ui)[^\\\\.]*}/**")
    @RequestMapping("/webui/")
    private String forwardWebUI() {
        return "forward:/index.html";
    }

    //                  ,"/{path:^(?!api$)(?!doc$)(?!assets$)(?!assets$)(?!webui$)(?!index.html)\\S+}/**"
    @RequestMapping({"/"})
    private String redirectWebUI() {
        return "redirect:/webui/";
    }

    @RequestMapping({"/doc"})
    private String redirectKnife4j() {
        return "redirect:/doc.html";
    }

}
