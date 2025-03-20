package com.astrapay.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.astrapay.dto.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotesService {
    private final Map<Long, Note> notes = new HashMap<>();
    private Long nextId = 1L;

    public Note createNote(Note note) {
        note.setId(nextId++);
        notes.put(note.getId(), note);
        return note;
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes.values());
    }

    public Note getNoteById(Long id) {
        return notes.get(id);
    }

    public Note updateNote(Long id, Note updatedNote) {
        Note existingNote = notes.get(id);
        if (existingNote != null) {
            existingNote.setTitle(updatedNote.getTitle());
            existingNote.setContent(updatedNote.getContent());
        }
        return existingNote;
    }

    public void deleteNote(Long id) {
        notes.remove(id);
    } 
}
