package A1;

import A1.model.ObrazacA1;
import A1.model.TFizickoLice;
import A1.model.TPravnoLice;
import Parser.XMLCustomParser;
import Z1.model.FLice;

import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws JAXBException {

        ObrazacA1 obrazacA1 = XMLCustomParser.unmarshall("A1", ObrazacA1.class);
        obrazacA1.getZaglavlje().setNaslov("novi naslov");
        System.out.println(((TPravnoLice)obrazacA1.getPodnosilac()).getPoslovnoIme());
        XMLCustomParser.marshall("A1", obrazacA1);
    }
}
