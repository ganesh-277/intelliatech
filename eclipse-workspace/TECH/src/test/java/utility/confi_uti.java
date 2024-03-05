package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class confi_uti {
	
Properties pro;
public confi_uti() throws IOException
{
	pro=new Properties();
File p=new File("C:\\Users\\admin\\eclipse-workspace\\TECH\\cred.properties");
FileInputStream file=new FileInputStream(p);

pro.load(file);

}

public String getbase()
{
	String url = pro.getProperty("baseurl");
	return url;
	
}

}
