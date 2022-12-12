package P1;

import P1.model.ObrazacP1;
import P1.model.TPodnosilacFizickoLice;
import Parser.XMLCustomParser;
import Z1.model.ObrazacZ1;

import javax.xml.bind.JAXBException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws JAXBException {

        ObrazacP1 obrazacP1 = XMLCustomParser.unmarshall("P1", ObrazacP1.class);
        obrazacP1.getPrimalacZahteva().setNaziv("novi naziv");
        obrazacP1.getPrimalacZahteva().getAdresa().getMesto().setNaziv("novo mesto");
        obrazacP1.getPrimalacZahteva().getAdresa().getMesto().setDrzava("drzava");
        obrazacP1.getPrimalacZahteva().getAdresa().getMesto().setPostanskiBroj((BigInteger.valueOf(11000)));
        XMLCustomParser.marshall("P1", obrazacP1);
    }

}
