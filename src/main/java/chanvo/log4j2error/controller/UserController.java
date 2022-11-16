package chanvo.log4j2error.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Chanvo
 */
@CrossOrigin
@RestController
public class UserController {
    public static final Logger logger = LogManager.getLogger(UserController.class);

    @PostMapping("login.do")
    public ResponseEntity<String> doLogin(@RequestBody String body) {
        logger.info("RequestParam: {}", body);
        return ResponseEntity.ok(body);
    }

    @GetMapping("login")
    public ModelAndView login() {
        return new ModelAndView("index");
    }
}
