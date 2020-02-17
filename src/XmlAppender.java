import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlAppender  implements DifferentAppender
{

    public String Appender(String s) throws IOException, SAXException, ParserConfigurationException
    {
        File file = new File (s);

        String str = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();


        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);


        NodeList nListtnew= document.getElementsByTagName("PL_Signature");
        Element childdd  = (Element) nListtnew.item(0);
        str=childdd.getTextContent();



        return str;
    }

}
