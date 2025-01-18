package br.com.eapg.factory;

public class Demo {
	
	public static void main (String args []) {
		Costumer cliente = new Costumer("A", false);
		Costumer cliente1 = new Costumer("B", false);
		Factory factory = getFactory (cliente);
		Factory factory1 = getFactory1 (cliente1);
		Car car = factory.create(cliente.gradeRequest());
		Car car1 = factory1.create(cliente1.gradeRequest());
		car.startEngine();
		car.startEngine();
	}

	private static Factory getFactory(Costumer cliente) {
		if(cliente.hasCompanyContract()) {
			return new  ContratosFactory();
		}else {
			return new SemContratosFactory();
		}
	}
	
	private static Factory getFactory1(Costumer cliente1) {
		if (cliente1.hasCompanyContract()) {
			return new ContratosFactory();
		}else {
			return new SemContratosFactory();
		}
	}
}
