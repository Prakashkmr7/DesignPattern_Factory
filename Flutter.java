package FactoryDesignPattern;

import FactoryDesignPattern.components.*;

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
	
	/*Problem - bcz we are passsing String value may be it will have type bcz string will have any value.So always use enum
	to solve this issue
	 */

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
	
	//Above String Issue problem can be solved using enum even if we will pass wrong input it will give compile type error
	//which will be much better than run time error.
	//This factory method is used to create an object of UIFactory. So avoid OCP let move this method to another class.
	//Flutter is my main class so don't want to change this in this, if some new requirements coming in the future.
	public UIFactory createUiFactory(SupportedPlatform platform)
	{
		//just taking this code to UIFactoryFactory class like taking garbage to some separate place - we cannot avoid if - else so best way to keep at correct place.
//		if(platform.equals(SupportedPlatform.ANDROID)) {
//			return new AndroidUIFactory();
//			}
//		else if(platform.equals(SupportedPlatform.IOS)) {
//			return new IosUIFactory();
//			}
//		return null;

		//Moving this above if else code from Flutter class to another factory i.e. UIFactory class is Practical Factory.(This is not a Design pattern
		//its just a good coding practice to define.
		return UIFactoryFactory.createUIFactory(platform);
	}	
}
