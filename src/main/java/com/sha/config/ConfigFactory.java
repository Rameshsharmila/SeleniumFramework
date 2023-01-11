package com.sha.config;

//mark it as final so it cant be extended
public final class ConfigFactory {
	
	//private constructor - cant create object
	private ConfigFactory() {};
	
	 public static FrameworkConfig getConfig(){
	        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
	    }

}
