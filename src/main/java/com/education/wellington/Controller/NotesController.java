package com.education.wellington.Controller;

import com.education.wellington.Entity.Notes;
import com.education.wellington.Repository.NotesRepository;
import com.education.wellington.Service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NotesController {
    @Autowired
    private NotesService notesService;

    @PostMapping("/addNotes")
    public Notes addNotes(@RequestBody Notes notes){
        return notesService.addNote(notes);
    }

    @PutMapping("/updateNotes")
    public Notes updateNotes(@RequestBody Notes notes){
        return notesService.updateNotes(notes);
    }

    @DeleteMapping("/deleteNotes/{id}")
    public String deleteNotes(@PathVariable Long id){
        return notesService.deleteNotes(id);
    }
}
