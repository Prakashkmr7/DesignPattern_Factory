package FactoryDesignPattern.components;


import FactoryDesignPattern.Flutter;
import FactoryDesignPattern.components.Button;
import FactoryDesignPattern.components.DropDown;
import FactoryDesignPattern.components.SupportedPlatform;

public class Client {

	public static void main(String[] args) {
		//If we want to use Flutter which object we will create directly.
		//If we want to use these code use android class.
		Flutter flutter =new Flutter();
		
		//From Flutter we want to create UIFactory
		UIFactory uiFactory=flutter.createUiFactory(SupportedPlatform.ANDROID);//if we will pass wrong value here it will give compile time error
		//reference is of type UI Factory but object is androidFactory in this, in above line of Code
		//	uiFactory.createButton();

		/*
		If we want to move from android to IOS , just change this line ANDROID to IOS value
		UIFactory uiFactory=flutter.createUiFactory(SupportedPlatform.IOS);
		 */

		Button button=uiFactory.createButton();
		DropDown dropDown=uiFactory.createDropDown();
		
		button.printButton();
		dropDown.showDropDown();
		
		System.out.println("DEBUG...");
		
		

	}

}
