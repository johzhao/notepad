package com.notepad.controller;

import com.notepad.model.Notepad;
import com.notepad.model.Response;
import com.notepad.repository.NotepadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jzhao
 */
@Controller
public class NotepadController {

    private final NotepadRepository repository;

    @Autowired
    public NotepadController(NotepadRepository repository) {
        this.repository = repository;
    }

    @ResponseBody
    @PostMapping("/notepads")
    public Response addNotepad(@RequestBody Notepad notepad) {
        repository.save(notepad);
        return Response.ok();
    }

    @ResponseBody
    @GetMapping("/notepads")
    public Response getAllNotepads(Pageable pageable) {
        Page<Notepad> notepads = repository.findAll(pageable);
        int totalPages = notepads.getTotalPages();
        int number = notepads.getNumber();
        return Response.ok(new com.notepad.model.Page<>(number, totalPages, notepads.getContent()));
    }

}
