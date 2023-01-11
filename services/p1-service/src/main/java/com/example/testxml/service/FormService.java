package com.example.testxml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testxml.model.ObrazacP1;

@Service
public class FormService {
    @Autowired
    ParserService parserService;

    public ObrazacP1 getForm() {
        ObrazacP1 obrazacP1 = null;
        try {
            obrazacP1 = parserService.unmarshall("P1", ObrazacP1.class);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return obrazacP1;
    }

}
