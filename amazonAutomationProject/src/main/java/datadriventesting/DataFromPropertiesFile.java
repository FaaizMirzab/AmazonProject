package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFromPropertiesFile {
         public static void main(String[] args) throws IOException {
			Properties p= new Properties();
			FileInputStream files=new FileInputStream("./datadriventesting.properties");
		    p.load(files);
		    p.getProperty("url");	
		}
}
