package com.example.testxml.service;

import com.example.testxml.model.Obrasci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    @Autowired
    ParserService parserService;

    public Obrasci getForm() {
        Obrasci obrazacZ1 = null;
        try {
            obrazacZ1 = parserService.unmarshall("Z1", Obrasci.class);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return obrazacZ1;
    }

}
