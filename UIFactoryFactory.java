package FactoryDesignPattern.components;


//why name is UIFactoryFactory - as its Factory for UIFactory
//keeping all the if condition of UIFactory code.

public class UIFactoryFactory {
	
	public static UIFactory createUIFactory(SupportedPlatform platform)
	{
		if(platform.equals(SupportedPlatform.ANDROID)) {
			return new AndroidUIFactory();
			}
		else if(platform.equals(SupportedPlatform.IOS)) {
			return new IosUIFactory();
			}
		return null;	
	}

}
