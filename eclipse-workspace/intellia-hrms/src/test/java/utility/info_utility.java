package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class info_utility {
Properties pro;	
	
public info_utility() throws IOException
{
	String File="C:\\Users\\admin\\eclipse-workspace\\intellia-hrms\\info.properties";
	pro=new Properties();
	
	FileInputStream pp=new FileInputStream(File);
	pro.load(pp);
}

public String getusername()
{
	 String UU = pro.getProperty("USERNAME");
	 return UU;
}

public String getpassword()
{
	String PWD = pro.getProperty("PASSWORD");
	 return PWD;
}
public String getfullname()
{
	 return pro.getProperty("FULLNAME");
}
public String getemail()
{
	 return pro.getProperty("EMAIL");
}
public String get_emppassword()
{
	 return pro.getProperty("EMP_PASSWORD");
}
}
