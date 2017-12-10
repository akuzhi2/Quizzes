package Photos;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Name: ALina Kuzhiyil
 * Description: 
 * Since the location of the image constantly changes depending on where the folder is stored, this is used to make sure the location stays dynamic and the program will find the 
 * location each time
 * Citation
 * http://www.rgagnon.com/javadetails/java-0581.html
 */
public class Location {

    /**
     * This accesses the file and returns it as a string
     * @return String file location
     */
    public String getRoot() throws IOException, URISyntaxException{
        URL u = getClass().getProtectionDomain().getCodeSource().getLocation();
        File f = new File(u.toURI());
        String s = f.getCanonicalPath();
        return s;
    }

    /**
     * This makes the file location's back slashes into a forward slash
     * @return String file location modified
     */
    public String switchSlash() throws IOException, URISyntaxException
    {
        String s = "";
        String v = getRoot();
        for(int i = 0; i<v.length(); i++)
        {
            if(v.substring(i,i+1).equals("\\"))
            {
                s+="/";
            }
            else
            {
                s+=v.substring(i,i+1);
            }
        }
        return s;
    }
}