package Z1;

import Parser.XMLCustomParser;
import Z1.model.FLice;
import Z1.model.ObrazacZ1;

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
        ObrazacZ1 obrazacZ1 = unmarshallThis();
        marshallThis(obrazacZ1);
    }

    public static ObrazacZ1 unmarshallThis() throws JAXBException {
        System.out.println("--------------------------------------------------");
        System.out.println("Unmarshalling");
        System.out.println("--------------------------------------------------");
        ObrazacZ1 obrazacZ1 = XMLCustomParser.unmarshall("Z1",ObrazacZ1.class);
        //System.out.println(obrazacZ1.toString(0));
        return obrazacZ1;
    }
    public static void marshallThis(ObrazacZ1 obrazacZ1){
        ((FLice)(obrazacZ1.getPopunjavaPodnosilac().getPunomocnik())).setIme("Novo ime");
        ((FLice)(obrazacZ1.getPopunjavaPodnosilac().getPunomocnik())).setPrezime("Novo prezime");
        obrazacZ1.getPopunjavaPodnosilac().getPunomocnik().getKontakt().setTelefon("0622222222");
        obrazacZ1.getPopunjavaPodnosilac().getPunomocnik().getKontakt().setEmail("newMail@test.test");
        obrazacZ1.getPopunjavaPodnosilac().getPunomocnik().getAdresa().getUlica().setNaziv("Novoizgradjena ulica");
        obrazacZ1.getPopunjavaPodnosilac().getPunomocnik().getAdresa().getUlica().setBroj("15");
        //obrazacZ1.getPopunjavaPodnosilac().getPunomocnik().getKontakt().setEmail("fakeMail");
        System.out.println("--------------------------------------------------");
        System.out.println("Marshalling");
        System.out.println("--------------------------------------------------");
        XMLCustomParser.marshall("Z1", obrazacZ1);
    }


}
