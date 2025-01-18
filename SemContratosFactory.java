package br.com.eapg.factory;

public class SemContratosFactory extends Factory{

	@Override
	Car retrieveCar(String requestedGrade) {
		if ("A".equals(requestedGrade)) {
			return new Brasilia(100, "full", "white");
		}else  if ("B".equals(requestedGrade)) {
			return new Ford(200, "full", "Black");
		}else {
			return null;
		}
			
		
	}

}
