package FactoryDesignPattern.components;

import FactoryDesignPattern.UIFactory;

public class AndroidUIFactory implements UIFactory{

	@Override
	public Button createButton() {
		
		return new AndroidButton();//No need of any if-else as we will return only AndroidButton here.
	}

	@Override
	public DropDown createDropDown() {
		
		return new AndroidDropDown();
	}

}
