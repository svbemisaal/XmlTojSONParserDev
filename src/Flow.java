import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

public class Flow
{

    public void init(String s) throws ParserConfigurationException, SAXException, IOException
    {
        TypeInput obj;

        obj = new FileHandler();
        RandomAccessFile file = obj.input(s);
        FileType obj1;
        obj1 = new XmlExtension();
        String extension = obj1.unique(s);


        if (extension.equals("xml"))
        {
            DifferentParser obj2;
            obj2 = new Xmlparser();
            Map<String, CarIdentities> mapv = obj2.parser(s);
            DifferentAppender obj3;
            obj3 = new XmlAppender();
            String stre = obj3.Appender(s);
            obj2.print(mapv, stre);
        }

        else  if(extension.equals("txt"))
        {

            String beta;
            while ((beta = file.readLine()) != null) {


                DifferentParser obj2;
                obj2 = new Xmlparser();
                Map<String, CarIdentities> mapv = obj2.parser(beta);
                DifferentAppender obj3;
                obj3 = new XmlAppender();
                String stre = obj3.Appender(beta);
                obj2.print(mapv, stre);
            }
        }
    }

}
