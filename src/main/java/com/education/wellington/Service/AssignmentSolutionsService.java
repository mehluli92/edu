package com.education.wellington.Service;

import com.education.wellington.Entity.Assignment;
import com.education.wellington.Entity.AssignmentSolutions;
import com.education.wellington.Repository.AssignmentRepository;
import com.education.wellington.Repository.AssignmentSolutionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentSolutionsService {
    @Autowired
    private AssignmentSolutionsRepository assignmentSolutionsRepository;
    @Autowired
    private AssignmentRepository  assignmentRepository;

    public AssignmentSolutions add(AssignmentSolutions assignmentSolutions){
        return assignmentSolutionsRepository.save(assignmentSolutions);
    }

    public AssignmentSolutions update(AssignmentSolutions assignmentSolutions){
        return assignmentSolutionsRepository.save(assignmentSolutions);
    }

    public AssignmentSolutions get(Long id){
        return assignmentSolutionsRepository.findById(id).orElse(null);
    }

    public List<AssignmentSolutions> getAll(){
        return assignmentSolutionsRepository.findAll();
    }

    public String delete(Long id){
        AssignmentSolutions assignmentSolutions = assignmentSolutionsRepository.findById(id).orElse(null);
        if (assignmentSolutions == null){
            return "Does not  exist";
        }
        Long assignmentId = assignmentSolutions.getAssignmentId();
        Assignment assignment = assignmentRepository.findById(assignmentId).orElse(null);
        String assignmentName = assignment.getName();
        return assignmentName +  " deleted with success";
    }
}
