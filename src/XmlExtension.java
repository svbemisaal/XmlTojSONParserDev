public class XmlExtension  implements FileType
{
     public String unique(String s)
     {

         FileType obj1;


         String extension = "";

         int i = s.lastIndexOf('.');

         if (i >= 0)
         {
             extension = s.substring(i+1);
         }


         return extension;


//         if(extension.equals("xml"))
//         {
//
//             obj1=new Xmlparser();
//
//             //xmlparser = new Xmlparser();
//             obj1.parser(s);
//         }

     }
}
