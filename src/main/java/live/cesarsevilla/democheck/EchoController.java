/***
 * This class is a Spring REST controller that exposes
 * an endpoint to retrieve client information.
 * @since 1.0
 * @version 1.0
 * @see org.springframework.web.bind.annotation.RestController
 */
package live.cesarsevilla.democheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EchoController {

    /***
     * Logger for the EchoController class.
     */
    private static final Logger LOG = LoggerFactory.getLogger(
        EchoController.class);

    /***
     * This method retrieves the client information
     * from the request and the User-Agent header.
     * @param request The HTTP request.
     * @param userAgent The User-Agent header.
     * @return A map containing the client information.
     */
    @GetMapping("/client-info")
    public Map<String, String> getClientInfo(final HttpServletRequest request,
        @RequestHeader("User-Agent") final String userAgent) {
        String ipAddress = request.getRemoteAddr();
        Map<String, String> clientInfo = new HashMap<>();
        clientInfo.put("ipAddress", ipAddress);
        clientInfo.put("userAgent", userAgent);

        // Log the client information
        LOG.info("Client IP Address: {}", ipAddress);
        LOG.info("Client User-Agent: {}", userAgent);

        return clientInfo;
    }
}
