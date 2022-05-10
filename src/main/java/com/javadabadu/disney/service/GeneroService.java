package com.javadabadu.disney.service;

import com.javadabadu.disney.exception.ExceptionBBDD;
import com.javadabadu.disney.models.entity.Genero;
import com.javadabadu.disney.models.entity.Personaje;

import java.util.List;

public interface GeneroService  {
    Genero findById(Integer id) throws ExceptionBBDD;
    List<Genero> findAll() throws ExceptionBBDD;
    Genero save(Genero genero,Integer id) throws ExceptionBBDD;
    Integer lastValueId() throws ExceptionBBDD;
    Genero update(Genero genero) throws ExceptionBBDD;
    String softDelete(Integer id);
    void responseBBDD(String response, Integer id)throws ExceptionBBDD;
    Boolean existsById(Integer id);
    Genero getGenero(Genero genero, Integer id) throws ExceptionBBDD ;

    }
