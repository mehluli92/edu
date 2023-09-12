package com.education.wellington.Controller;

import com.education.wellington.Entity.AssignmentSolutions;
import com.education.wellington.Service.AssignmentSolutionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignmentSolutions")
public class AssignmentSolutionsController {
    @Autowired
    private AssignmentSolutionsService assignmentSolutionsService;

    @PostMapping("/add")
    public AssignmentSolutions add(@RequestBody AssignmentSolutions assignmentSolutions){
        return assignmentSolutionsService.add(assignmentSolutions);
    }

    @PutMapping("/update")
    public AssignmentSolutions update(@RequestBody AssignmentSolutions assignmentSolutions){
        return assignmentSolutionsService.update(assignmentSolutions);
    }

    @GetMapping("/get")
    public AssignmentSolutions get(@PathVariable Long id){
        return assignmentSolutionsService.get(id);
    }

    @GetMapping("/getAll")
    public List<AssignmentSolutions> getAll(){
        return assignmentSolutionsService.getAll();
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return assignmentSolutionsService.delete(id);
    }
}
