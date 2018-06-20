package agmasse.zelalem.springboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String mainCourse(){
        return "index";
    }
    @RequestMapping("/breakfast")
    public String breakfast(){
        return "breakfast";
    }
    @RequestMapping("/dessert")
    public String dessert(){
        return "Dessert";
    }
    @RequestMapping("/gallery")
    public String gallery(){
        return "gallery";
    }
    @RequestMapping("/salad")
    public String salad(){
        return "salad";
    }
    @RequestMapping("/sandwich")
    public String sandwich(){
        return "sandwich";
    }
    @RequestMapping("/soup")
    public String soup(){
        return "soup";
    }


}
