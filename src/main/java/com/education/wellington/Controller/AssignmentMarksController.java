package com.education.wellington.Controller;

import com.education.wellington.Entity.AssignmentMarks;

import com.education.wellington.Service.AssignmentMarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignmentMarks")
public class AssignmentMarksController {
    @Autowired
    private AssignmentMarksService assignmentMarksService;

    @PostMapping("/add")
    public AssignmentMarks add(@RequestBody AssignmentMarks assignmentMarks){
        return assignmentMarksService.addAssignmentMarks(assignmentMarks);
    }

    @GetMapping("/get/{id}")
    public AssignmentMarks getSingle(@PathVariable Long id){
        return assignmentMarksService.getAssignmentMarks(id);
    }

    @GetMapping("/getAll")
    public List<AssignmentMarks> getAll(){
        return assignmentMarksService.getAllAssignmentMarks();
    }

    @PutMapping("/update")
    public AssignmentMarks update(@RequestBody AssignmentMarks assignmentMarks){
        return assignmentMarksService.updateAssignmentMarks(assignmentMarks);
    }

    @DeleteMapping("/delete/{id}")
    public String  delete(@PathVariable Long id){
        return assignmentMarksService.deleteAssignmentMarks(id);
    }
}
