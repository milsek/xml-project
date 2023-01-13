package com.example.testxml.controller;

import com.example.testxml.model.Obrasci;
import com.example.testxml.model.Obrasci;
import com.example.testxml.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/forms", consumes = MediaType.APPLICATION_XML_VALUE)
public class FormController {
    @Autowired
    FormService formService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Obrasci> getForm() {
        Obrasci form = formService.getForm();
        System.out.println(form);
        return new ResponseEntity<>(form, form == null ? HttpStatus.INTERNAL_SERVER_ERROR : HttpStatus.OK );
    }

}
