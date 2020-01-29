package isha.resume.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import javax.servlet.ServletContext;

// TODO: 28/01/2020  добавить фильтры до SpringSecurityFilterChain
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    @Override
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {


        super.beforeSpringSecurityFilterChain(servletContext);
    }
}
