import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public abstract class DifferentParser
{
            void print(Map<String, CarIdentities> mapv, String str)
            {


                Iterator it = mapv.entrySet().iterator();
                ObjectMapper ob = new ObjectMapper();

                String json ="";

                while(it.hasNext())
                {
                    Map.Entry mape = (Map.Entry)it.next();
                    CarIdentities ce = (CarIdentities)mape.getValue();
                    try
                    {
                        json=json+(ob.writeValueAsString(ce));
                        json+='\n';
                    }
                    catch (JsonProcessingException e)
                    {
                        e.printStackTrace();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }


                try
                {

                    FileWriter file = new FileWriter("/Users/shubham.varshney/Documents"+"/"+str+".txt");
                    System.out.print(json);
                    file.write(json);
                    file.flush();
                    file.close();
                }

                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

         abstract Map<String, CarIdentities> parser(String s) throws ParserConfigurationException, IOException, SAXException;
}
