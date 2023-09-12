package com.education.wellington.Controller;

import com.education.wellington.Entity.Assignment;
import com.education.wellington.Service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignmment")
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/add")
    public Assignment addAssignment(@RequestBody Assignment assignment){
        return assignmentService.addAssignment(assignment);
    }

    @GetMapping("/get/{id}")
    public Assignment getAssignment(@PathVariable Long id){
        return assignmentService.getAssignment(id);
    }

    @GetMapping("/getAll")
    public List<Assignment> getAllAssignments(){
        return assignmentService.getAllAssignment();
    }

    @PutMapping("/update")
    public Assignment updateAssignment(Assignment assignment){
        return assignmentService.updateAssignment(assignment);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAssignment(@PathVariable Long id){
        return assignmentService.deleteAssignment(id);
    }
}
