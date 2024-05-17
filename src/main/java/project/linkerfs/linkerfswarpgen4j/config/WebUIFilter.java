package project.linkerfs.linkerfswarpgen4j.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;


public class WebUIFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String path = httpRequest.getRequestURI();
        if (path.matches("(\\S+/)+(\\S+)?\\.(\\S+)?")) {
            path = path.replace("/webui", "");
            httpRequest.getRequestDispatcher(path).forward(request, response);
            //chain.doFilter(request,response);
        } else {
            path = "/webui/";
            httpRequest.getRequestDispatcher(path).forward(request, response);
        }
    }
}
