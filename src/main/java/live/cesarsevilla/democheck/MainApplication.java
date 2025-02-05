/***
 * Created by Cesar Sevilla
 * Date: 2025-02-04
 * Description: Main class for the Spring Boot application
 * Version: 1.0
 */
package live.cesarsevilla.democheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings({"PMD", "checkstyle:hideutilityclassconstructor"})
@SpringBootApplication
public class MainApplication {
    /***
     * Main method to run the Spring Boot application.
     * @param args Arguments to run the application
     */
    public static void main(final String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
