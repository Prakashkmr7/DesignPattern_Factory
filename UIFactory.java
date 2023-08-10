package FactoryDesignPattern;

import FactoryDesignPattern.components.Button;
import FactoryDesignPattern.components.DropDown;

public interface UIFactory {
//this should only contain the factory method.
	
Button createButton();// Factory method ? Yes , as it will return object of corresponding button 
	
DropDown createDropDown();
	
}
