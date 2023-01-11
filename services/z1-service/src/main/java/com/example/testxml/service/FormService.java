package com.example.testxml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testxml.model.ObrazacZ1;

@Service
public class FormService {
    @Autowired
    ParserService parserService;

    public ObrazacZ1 getForm() {
        ObrazacZ1 obrazacZ1 = null;
        try {
            obrazacZ1 = parserService.unmarshall("Z1", ObrazacZ1.class);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return obrazacZ1;
    }

}
