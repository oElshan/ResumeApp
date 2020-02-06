package isha.resume.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// TODO: 29/01/2020 добавить securoty config
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class<?>[]{RootConfig.class,WebSecurityConfig.class};
//        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }


//        @Override
//        protected Filter[] getServletFilters() {
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setEncoding("UTF-8");
//       return new Filter[]{ characterEncodingFilter, new SiteMeshFilter() };
//        return new Filter[]{ characterEncodingFilter };
//    }
//
//
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
