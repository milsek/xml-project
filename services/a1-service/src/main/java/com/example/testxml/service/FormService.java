package com.example.testxml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testxml.model.Obrasci;

@Service
public class FormService {
    @Autowired
    ParserService parserService;

    public Obrasci getForm() {
        Obrasci obrasci = null;
        try {
            obrasci = parserService.unmarshall("A1", Obrasci.class);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return obrasci;
    }

}
