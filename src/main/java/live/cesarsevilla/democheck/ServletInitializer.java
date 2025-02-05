package live.cesarsevilla.democheck;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    /***
     * This method configures the Spring Boot application.
     * @param application The Spring application builder.
     * @return The Spring application builder.
     */
    @Override
    protected SpringApplicationBuilder configure(
        final SpringApplicationBuilder application) {
        return application.sources(MainApplication.class);
    }

}
