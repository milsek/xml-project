package com.example.testxml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testxml.model.ObrazacA1;

@Service
public class FormService {
    @Autowired
    ParserService parserService;

    public ObrazacA1 getForm() {
        ObrazacA1 obrazacA1 = null;
        try {
            obrazacA1 = parserService.unmarshall("A1", ObrazacA1.class);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return obrazacA1;
    }

}
