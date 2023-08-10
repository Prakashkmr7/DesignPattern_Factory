package FactoryDesignPattern.components;

import FactoryDesignPattern.UIFactory;

public class IosUIFactory implements UIFactory{

	@Override
	public Button createButton() {
		
		return new IosButton();
	}

	@Override
	public DropDown createDropDown() {
		
		return new IosDropDown();
	}

}
