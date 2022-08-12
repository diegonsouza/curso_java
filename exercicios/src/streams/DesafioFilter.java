package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		CarroFilter car1 = new CarroFilter("Chevrolet", "Celta", 156);
		CarroFilter car2 = new CarroFilter("Honda", "Civic", 195);
		CarroFilter car3 = new CarroFilter("Ferrari" ,"488", 340);
		CarroFilter car4 = new CarroFilter("Porche", "Panamera", 315);
		
		List<CarroFilter> carros = Arrays.asList(car1,car2,car3,car4);
					
		Predicate<CarroFilter> velocidade = v -> v.velocidadeMax > 250;
		Function<CarroFilter, String> esportivo = e -> "O veiculo " + e.marca +" "+ e.modelo + " e esportivo!";
		
		carros.stream().filter(velocidade).map(esportivo).forEach(System.out::println);
	}

} 
