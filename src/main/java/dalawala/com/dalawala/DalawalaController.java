package dalawala.com.dalawala;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DalawalaController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    
}
