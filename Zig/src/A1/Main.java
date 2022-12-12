package A1;

import A1.model.ObrazacA1;
import A1.model.TPravnoLice;
import Parser.XMLCustomParser;

import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws JAXBException {
        ObrazacA1 obrazacA1 = unmarshallThis();
        marshallThis(obrazacA1);
    }

    public static ObrazacA1 unmarshallThis() throws JAXBException {
        System.out.println("--------------------------------------------------");
        System.out.println("Unmarshalling");
        System.out.println("--------------------------------------------------");
        ObrazacA1 obrazacA1 = XMLCustomParser.unmarshall("A1", ObrazacA1.class);
        return obrazacA1;
    }
    public static void marshallThis(ObrazacA1 obrazacA1){
        obrazacA1.getZaglavlje().setNaslov("Novi naslov");
        obrazacA1.getAutori().getAutor().get(0).setPrezime("Pašić");
        obrazacA1.getAutori().getAutor().get(0).getAdresa().getUlica().setNaziv("Nova ulica");
        obrazacA1.getPodnosilac().setEMail("noviemail@noemail.com");
        ((TPravnoLice)obrazacA1.getPodnosilac()).setPoslovnoIme("Nova firma doo");
        obrazacA1.getIdentifikacijaPrijave().setBroj("A-9876-2019");  // VALID ID
//        obrazacA1.getIdentifikacijaPrijave().setBroj("A-0313-201");  // INVALID ID
        System.out.println("--------------------------------------------------");
        System.out.println("Marshalling");
        System.out.println("--------------------------------------------------");
        XMLCustomParser.marshall("A1", obrazacA1);
    }
}
