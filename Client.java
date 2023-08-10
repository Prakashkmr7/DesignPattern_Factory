package FactoryDesignPattern;


import FactoryDesignPattern.components.Button;
import FactoryDesignPattern.components.DropDown;
import FactoryDesignPattern.components.SupportedPlatform;

public class Client {

	public static void main(String[] args) {
		//If we want to use these code use android class.
		Flutter flutter =new Flutter();
		
		//From Flutter we want to create UIFactory
		UIFactory uiFactory=flutter.createUiFactory(SupportedPlatform.ANDROID);/*if we will pass wrong value here it will give compile time error
		//reference is of type UI Factory but object is androidFactory in this */
		//	uiFactory.createButton();
		Button button=uiFactory.createButton();
		DropDown dropDown=uiFactory.createDropDown();
		
		button.printButton();
		dropDown.showDropDown();
		
		System.out.println("DEBUG...");
		
		

	}

}
