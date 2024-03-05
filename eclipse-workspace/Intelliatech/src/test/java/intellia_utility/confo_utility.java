package intellia_utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class confo_utility {
	
Properties p;	
String path="C:\\Users\\admin\\eclipse-workspace\\Intelliatech\\cred.properties";
public confo_utility() throws FileNotFoundException
{
	p=new Properties();
	//File file=new File("C:\\Users\\admin\\eclipse-workspace\\Intelliatech\\cred.properties");
	FileInputStream st=new FileInputStream(path);
	try {
		p.load(st);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public String geturl()
{
	String URL = p.getProperty("BASEURL");
	return URL;
}

}
