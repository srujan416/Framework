/**
 * 
 */
package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Dell
 *
 */
public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() {
		
		File src = new File("./Config/Config.Properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
		
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Not able to load config file"+e.getMessage());
				
			}
			
		}
	
	
	public String getDataFromConfig(String keyToSearch) 
	{
		
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser() 
	{
		
		return pro.getProperty("Browser");
		
	}
	
	public String getqaURL() 
	{
		
		return pro.getProperty("qaURL");
		
	}


	
	}

