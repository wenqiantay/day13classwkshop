package vttp.ssf.day13wkshop.Controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import vttp.ssf.day13wkshop.Models.Task;

@Controller
@RequestMapping("/todolist")
public class TaskController {
    
    @PostMapping("/obj")
    public String postTaskObj(@RequestBody MultiValueMap<String, String> form, @ModelAttribute Task task, BindingResult bindings, Model model, HttpSession sess){

        //check if session has the task list
        List<Task> taskList = (List<Task>)sess.getAttribute("tasklist");
        if(taskList == null) {
            taskList = new LinkedList<>();
            sess.setAttribute("tasklist", taskList);
        }
        taskList.add(task);
        
        model.addAttribute("tasklist", taskList);
        model.addAttribute("task", task);
        
        return "index";
    }

}
