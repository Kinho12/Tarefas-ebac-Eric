package br.com.eapg.factory;

public class ContratosFactory extends Factory{

	@Override
	Car retrieveCar(String requestedGrade) {
		if ("A".equals(requestedGrade)) {
			return new CorolaCar(100, "full", "blue");
		}else {
			return null;
		}
	}

}
//contratos