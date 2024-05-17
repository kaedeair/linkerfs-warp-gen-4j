package project.linkerfs.linkerfswarpgen4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LinkerfsWarpGen4jApplication {

    public static void main(String[] args) {


        SpringApplication.run(LinkerfsWarpGen4jApplication.class, args);
//        AntPathMatcher m = new AntPathMatcher();
//        System.out.println(m.match("/{path:^(?!api$)(?!doc$)(?!webui$)\\S*}/**","/webui/"));
//          /{path:^(?!api)(?!swagger-ui)[^\\\\.]*}/**
    }

}
