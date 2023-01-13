package com.example.testxml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testxml.model.Obrasci;

@Service
public class FormService {
    @Autowired
    ParserService parserService;

    public Obrasci getForm() {
        Obrasci obrazacP1 = null;
        try {
            obrazacP1 = parserService.unmarshall("P1", Obrasci.class);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return obrazacP1;
    }

}
