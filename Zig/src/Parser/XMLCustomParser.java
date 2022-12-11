package Parser;

import Z1.Z1Validator;
import Z1.model.ObjectFactory;
import Z1.model.ObrazacZ1;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class XMLCustomParser {


    public static <T> T unmarshall(String fileName, Class<T> obrazac) throws JAXBException {

        System.out.println("[INFO] Example 1: JAXB unmarshalling.\n");

        JAXBContext context = JAXBContext.newInstance(fileName+".model");

        Unmarshaller unmarshaller = context.createUnmarshaller();

        return obrazac.cast(unmarshaller.unmarshal(new File("data/" + fileName + ".xml")));
    }

    public static boolean marshall(String fileName, Object obrazac){

        if(!additionalValidations(obrazac)){
            return false;
        }

        try{

        JAXBContext context = JAXBContext.newInstance(fileName+ ".model");

        Marshaller marshaller = context.createMarshaller();

        File schemaFile = new File("data/" + fileName + ".xsd");
        SchemaFactory schemaFactory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(schemaFile);
        marshaller.setSchema(schema);

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        marshaller.marshal(obrazac, System.out);
            System.out.println("--------");
        return true;
        }
        catch (JAXBException | SAXException e){
            return false;
        }
    }

    public static boolean additionalValidations(Object obrazac){
        if(obrazac.getClass() == ObrazacZ1.class){
            return Z1Validator.additionalValidation((ObrazacZ1) obrazac);
        }
        return true;
    }
}
