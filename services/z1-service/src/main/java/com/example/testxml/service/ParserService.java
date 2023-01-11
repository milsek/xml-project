package com.example.testxml.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.FileWriter;

@Service
public class ParserService {
    public static <T> T unmarshall(String fileName, Class<T> obrazac) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance("com.example.testxml.model");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Resource resource = new ClassPathResource("forms/" + fileName + ".xml");
        return obrazac.cast(unmarshaller.unmarshal(new File(resource.getFile().toURI())));
    }

    public static boolean marshall(String fileName, Object obrazac) throws IOException {
        try{
            JAXBContext context = JAXBContext.newInstance(fileName+ ".model");

            Marshaller marshaller = context.createMarshaller();

            Resource readingResource = new ClassPathResource("forms/" + fileName + ".xsd");
            File schemaFile = new File(readingResource.getFile().toURI());
            SchemaFactory schemaFactory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(schemaFile);
            marshaller.setSchema(schema);

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            marshaller.marshal(obrazac, sw);
            System.out.println(sw);
            try {
                Resource writingResource = new ClassPathResource("forms/" + fileName + ".xsd");
                FileWriter myWriter = new FileWriter(String.valueOf(writingResource.getFile().toURI()));
                myWriter.write(String.valueOf(sw));
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Marshall sucessfull");
            return true;
        }
        catch (JAXBException | SAXException e){
            System.out.println("Marshalling unsuccessful");;
            return false;
        }
    }
}
