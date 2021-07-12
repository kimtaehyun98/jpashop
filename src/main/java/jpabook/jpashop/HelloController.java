package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // "localhost:8080/hello"를 입력시 이 코드가 Mapping 된다
    public String hello(Model model) { // Model에 data를 실어서 controller가 view로 넘김
        model.addAttribute("data", "hello!!");
        return "hello"; // 화면 이름 -> 즉 resources -> templates -> hello.html 파일을 찾아 return
    }
}
