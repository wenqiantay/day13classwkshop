package vttp.ssf.day13wkshop.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import vttp.ssf.day13wkshop.Models.Task;


@Controller
@RequestMapping
public class SaveController {
    @PostMapping("/exit")
    public String postExit(HttpSession sess, Model model){
        List<Task> taskList = (List<Task>)sess.getAttribute("tasklist");
        //destory session
        sess.invalidate();

        model.addAttribute("task", new Task());
        return "index";
    }
}
