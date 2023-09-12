package com.education.wellington.Service;

import com.education.wellington.Entity.Notes;
import com.education.wellington.Repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
    @Autowired
    private NotesRepository notesRepository;

    public Notes addNote(Notes notes){
        return notesRepository.save(notes);
    }

    public Notes updateNotes(Notes notes){
        Notes oldNotes = notesRepository.findById(notes.getId()).orElse(null);
        return notesRepository.save(notes);
    }

    public String deleteNotes(Long id){
        Notes oldNotes = notesRepository.findById(id).orElse(null);
        if (oldNotes == null){
            return "Does not exist";
        }
        String name = oldNotes.getName();
        return name + " deleted with success";
    }
}
