package com.education.wellington.Service;

import com.education.wellington.Entity.Assignment;
import com.education.wellington.Repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    //add
    public Assignment addAssignment(Assignment assignment){
        return assignmentRepository.save(assignment);
    }

    //view 1
    public Assignment getAssignment(Long id){
        return assignmentRepository.findById(id).orElse(null);
    }

    //view all
    public List<Assignment> getAllAssignment(){
        return assignmentRepository.findAll();
    }
    //edit 1
    public Assignment updateAssignment(Assignment assignment){
        return assignmentRepository.save(assignment);
    }

    //delete 1
    public String deleteAssignment(Long id){
        Assignment assignment = assignmentRepository.findById(id).orElse(null);

        if (assignment == null){
            return "Entry not found";
        }
        String name = assignment.getName();
        return name + "deleted successfully";
    }
}
