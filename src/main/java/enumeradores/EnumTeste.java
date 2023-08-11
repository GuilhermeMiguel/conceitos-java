package enumeradores;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnumTeste {

	public static void main(String[] args) {
			
		
		var name1 = AutomovelEnum.CARRO.toString();
		
		
		var name = AutomovelEnum.CAMINHAO.name();
		
		System.out.println(name1);
		
		System.out.println(name);
	
		var existe = List.of(AutomovelEnum.values())
			.stream()
			.map(AutomovelEnum::name)
			.collect(Collectors.toList())
			.contains("CARRO");
		
		System.out.println(existe);
	}
}
