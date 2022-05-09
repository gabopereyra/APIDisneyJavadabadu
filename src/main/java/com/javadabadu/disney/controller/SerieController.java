package com.javadabadu.disney.controller;

import com.javadabadu.disney.exception.ExceptionBBDD;
import com.javadabadu.disney.models.entity.Serie;
import com.javadabadu.disney.repository.SerieRepository;
import com.javadabadu.disney.service.SerieService;
import com.javadabadu.disney.util.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = Uri.SERIES)
public class SerieController {

    @Autowired
    SerieService serieService;

    @GetMapping("/")
    public ResponseEntity<?> findAll(HttpServletRequest request) throws ExceptionBBDD {
        return ResponseEntity.ok().body(serieService.findAll());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findById(@PathVariable Integer id, HttpServletRequest request) throws ExceptionBBDD {
        return ResponseEntity.ok().body(serieService.findById(id));
    }
}