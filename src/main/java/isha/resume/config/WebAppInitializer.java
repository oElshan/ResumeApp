package isha.resume.config;

import isha.resume.filters.SiteMeshFilter;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.filter.RequestContextFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {

//        return new Class<?>[]{RootConfig.class,SecurityConfig.class};
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }


        @Override
        protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
//        return new Filter[]{ characterEncodingFilter, new SiteMeshFilter() };
        return new Filter[]{ characterEncodingFilter };
    }


    // TODO: 30/09/2019 Регистрация фильтра
//    private void registerFilters(ServletContext container, WebApplicationContext ctx) {
//        registerFilter(container, ctx.getBean(ResumeFilter.class));
//        registerFilter(container, new CharacterEncodingFilter("UTF-8", true));
//        registerFilter(container, new OpenEntityManagerInViewFilter());
//        registerFilter(container, new RequestContextFilter());
//        registerFilter(container, new DelegatingFilterProxy("springSecurityFilterChain"), "springSecurityFilterChain");
//        registerFilter(container, buildConfigurableSiteMeshFilter(), "sitemesh");
//    }
//
//    private void registerFilter(ServletContext container, Filter filter, String... filterNames) {
//        String filterName = filterNames.length > 0 ? filterNames[0] : filter.getClass().getSimpleName();
//        container.addFilter(filterName, filter).addMappingForUrlPatterns(null, true, "/*");
//    }


}
