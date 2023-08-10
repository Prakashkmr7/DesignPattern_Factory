package FactoryDesignPattern;

import FactoryDesignPattern.components.AndroidUIFactory;
import FactoryDesignPattern.components.IosUIFactory;
import FactoryDesignPattern.components.SupportedPlatform;
import FactoryDesignPattern.components.UIFactoryFactory;

public class Flutter {
	//Not a factory method as refreshing is similar in all.
	//If it will remain same for all type of entities then it will not a factory method.
	void refresh()
	{
		System.out.println("Refreshing...");
	}
	//Not a factory method as setting a theme is similar in all.
	void theme()
	{
		System.out.println("Setting a theme....");
	}
	
	//All of these below are factory method
	//Button createButton();
	//Menu createMenu();
	//Dropdown createDropdown();
	
	//A factory method is required to connect with the UIFactory.
	
	//Problem - bcz we are passsing String value may be it will have type bcz string will have any value.So always use enum
	// to solve this issue
//	public UIFactory creaUiFactory(String platform)
//	{
//		if(platform.equals("Android"))
//			return new AndroidUIFactory();
//		else if(platform.equals("Ios"))
//			return new IosUIFactory();
//		else
//		return null;	
//	}
	//above code violets OCP
	
	//Above String Issue problem can be solved using enum9even if we will pass wrong input it will give compile type error
	//which will be much better than run time error.
	//This factory method id used to create an object of UIFactory. So avoid OCP let move this method to another class.
	public UIFactory createUiFactory(SupportedPlatform platform)
	{
		//just taking this code to UIFactoryFactory class like taking garbage to some seperate place
//		if(platform.equals(SupportedPlatform.ANDROID)) {
//			return new AndroidUIFactory();
//			}
//		else if(platform.equals(SupportedPlatform.IOS)) {
//			return new IosUIFactory();
//			}
//		return null;
		return UIFactoryFactory.createUIFactory(platform);
	}	
}
