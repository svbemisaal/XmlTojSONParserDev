import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface DifferentAppender
{
    public String  Appender(String s) throws IOException, SAXException, ParserConfigurationException;
}
