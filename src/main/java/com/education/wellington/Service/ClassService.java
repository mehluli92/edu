package com.education.wellington.Service;

import com.education.wellington.Entity.Class;
import com.education.wellington.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public Class addClass(Class clas){
        return classRepository.save(clas);
    }

    public Class viewClass(Long id){
        return classRepository.findById(id).orElse(null);
    }

    public List<Class> viewClasses(){
        return classRepository.findAll();
    }

    public Class updateClass(Class clas){
        Class oldClass = classRepository.findById(clas.getId()).orElse(null);
        return classRepository.save(clas);
    }

    public String deleteClass(Long id){
        Class clas = classRepository.findById(id).orElse(null);
        if (clas == null){
            return "Class does not exist";
        }
        String name = clas.getName();
        classRepository.delete(clas);
        return name + "Deleted with success";
    }
}
