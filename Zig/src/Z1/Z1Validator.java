package Z1;

import Z1.model.Adresa;
import Z1.model.ObrazacZ1;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.io.File;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Z1Validator {
    public static boolean additionalValidation(ObrazacZ1 obrazacZ1) {
        List<Integer> classification = obrazacZ1.getPopunjavaPodnosilac().getNicanskaKlasifikacija().getBroj();
        HashMap<Integer, Integer> classificationMap = new HashMap<>();
        for(Integer number : classification){
            if(classificationMap.containsKey(number)){
                return false;
            }
            classificationMap.put(number, 1);
        }
        return true;
    }

}
