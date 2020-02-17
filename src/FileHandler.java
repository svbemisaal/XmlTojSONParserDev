import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

//
    public class FileHandler implements TypeInput
{
    public RandomAccessFile input(String alpha)
    {
        try
        {
            String s;
            RandomAccessFile file = new RandomAccessFile(alpha, "r");

          return file;

            }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }


        return null;
    }


}



