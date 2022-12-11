package Z1;

import Parser.XMLCustomParser;
import Z1.model.FLice;
import Z1.model.ObrazacZ1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {

        System.out.println("--------------------------------------------------");
        System.out.println("Unmarshalling");
        System.out.println("--------------------------------------------------");
        ObrazacZ1 obrazacZ1 = XMLCustomParser.unmarshall("Z1",ObrazacZ1.class);
        System.out.println(obrazacZ1.toString(0));
        System.out.println("--------------------------------------------------");
        System.out.println("Marshalling");
        System.out.println("--------------------------------------------------");
        obrazacZ1.getPopunjavaPodnosilac().getNicanskaKlasifikacija().getBroj().add(13);
        XMLCustomParser.marshall("Z1", obrazacZ1);
    }

    public static void print(ObrazacZ1 obrazacZ1){
    }


}
