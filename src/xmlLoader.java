import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.UnknownHostException;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;



public class xmlLoader {
	
	public static void main(String a[]){
		printPaths();
		try {
//			addPath("/Users/nnarayan/dev/trunk");
//            System.err.println("Paths after adding to classpath");
//            printPaths();
			System.err.println(InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	try {
		String hostname = "stg-imsacbroker12.ac.corp.yahoo.com";
		XMLConfiguration xmlConfig = new XMLConfiguration("environment.xml");
		
		List<Object> hostPatterns = xmlConfig.getList("environment.hostpattern");
		for (int index=0;index<hostPatterns.size();index++){
			if(hostname.contains(hostPatterns.get(index).toString())){
				try {
					addPath(xmlConfig.getProperty("environment("+index+").path").toString());
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//xmlConfig.getProperties("environment.hostpattern");
		System.err.println("Path after adding new entries");
		printPaths();
		InputStream is = xmlLoader.class.getResourceAsStream("sample.txt");
		System.err.println(is);
		
	} catch (ConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void addPath(String s) throws Exception {
	    java.io.File f = new java.io.File(s);
	    URL u = f.toURL();
	    URLClassLoader urlClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
	    Class urlClass = URLClassLoader.class;
	    java.lang.reflect.Method method = urlClass.getDeclaredMethod("addURL", new Class[]{URL.class});
	    method.setAccessible(true);
	    method.invoke(urlClassLoader, new Object[]{u});
	}
	
	public static void printPaths(){
    ClassLoader cl = ClassLoader.getSystemClassLoader();
    
    URL[] urls = ((URLClassLoader)cl).getURLs();

    for(URL url: urls){
    	System.out.println(url.getFile());
    }
	}
}
