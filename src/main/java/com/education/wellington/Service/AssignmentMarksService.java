package com.education.wellington.Service;

import com.education.wellington.Entity.AssignmentMarks;
import com.education.wellington.Entity.User;
import com.education.wellington.Repository.AssignmentMarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentMarksService {
    @Autowired
    private AssignmentMarksRepository assignmentMarksRepository;
    @Autowired
    private User user;

    public AssignmentMarks addAssignmentMarks(AssignmentMarks assignmentMarks){
        return assignmentMarksRepository.save(assignmentMarks);
    }

    public AssignmentMarks updateAssignmentMarks(AssignmentMarks  assignmentMarks){
        return assignmentMarksRepository.save(assignmentMarks);
    }

    public  AssignmentMarks getAssignmentMarks(Long id){
        return assignmentMarksRepository.findById(id).orElse(null);
    }

    public List<AssignmentMarks> getAllAssignmentMarks(){
        return assignmentMarksRepository.findAll();
    }

    public String deleteAssignmentMarks(Long id){
        AssignmentMarks assignmentMarks  =  assignmentMarksRepository.findById(id).orElse(null);
        if (assignmentMarks  ==  null){
            return "Does not exist";
        }
        Long studentId  =  assignmentMarks.getStudentId();
        String studentName =  user.getUsername();
        assignmentMarksRepository.findById(id);
        return studentName + "deleted with success";
    }
}
