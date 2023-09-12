package com.education.wellington.Controller;

import com.education.wellington.Entity.Class;
import com.education.wellington.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping("/addClass")
    public Class addClass(@RequestBody Class clas){
        return classService.addClass(clas);
    }

    @GetMapping("/getClasses")
    public List<Class> getClasses(){
        return classService.viewClasses();
    }

    @GetMapping("/viewClass/{id}")
    public Class viewClass(@PathVariable Long id){
        return classService.viewClass(id);
    }

    @PutMapping("/updateClass")
    public Class updateClass(@RequestBody Class clas){
        return classService.updateClass(clas);
    }

    @DeleteMapping("/deleteClass/{id}")
    public String deleteClass(@PathVariable Long id){
        return classService.deleteClass(id);
    }
}
