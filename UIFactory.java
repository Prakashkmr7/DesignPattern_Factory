package FactoryDesignPattern.components;

import FactoryDesignPattern.components.Button;
import FactoryDesignPattern.components.DropDown;

//Every type of platform we have UI Factory.
public interface UIFactory {
//this should only contain the factory method.
	
Button createButton();// Factory method ? Yes , as it will return object of corresponding button 
	
DropDown createDropDown();
	
}
