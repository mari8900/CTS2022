package maria.nicolaiciuc.g1099.facade;


public class TestPatternFacade {

	public static void main(String[] args) {
		
		System.out.println("_______________________SINGLETON_______________________");
		TestingPatternFacade.testSingleton();
		System.out.println(" ");
		
		System.out.println("_______________________BUILDER_______________________");
		TestingPatternFacade.testBuilder();
		System.out.println(" ");
		
		System.out.println("_______________________FACTORY_______________________");
		TestingPatternFacade.testFactory();
		System.out.println(" ");
		
		System.out.println("_______________________PROTOTYPE_______________________");
		TestingPatternFacade.testPrototype();
		System.out.println(" ");
		
		System.out.println("_______________________FLYWEIGHT_______________________");
		TestingPatternFacade.testFlyweight();
		System.out.println(" ");
		
		System.out.println("_______________________ADAPTER_______________________");
		TestingPatternFacade.testAdapter();
		System.out.println(" ");
		
		System.out.println("_______________________DECORATOR_______________________");
		TestingPatternFacade.testDecorator();
		System.out.println(" ");
		
		System.out.println("_______________________PROXY_______________________");
		TestingPatternFacade.testProxy();
	}

}
