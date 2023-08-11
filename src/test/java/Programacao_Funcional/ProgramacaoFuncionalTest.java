package Programacao_Funcional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramacaoFuncionalTest {

	@BeforeEach
	public void setup() {
		System.out.println("==========================");
	}

	@Test
	@DisplayName("Consumer")
	public void quandoNomesPresentesConsomeTodos() {

		Consumer<String> printConsumer = System.out::println; // t -> System.out.println(t);

		Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");

		cities.forEach(printConsumer);
	}

	@Test
	public void quandoNomesPresentesUse2Consumers() {

		List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

		Consumer<List<String>> upperCaseConsumer = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i).toUpperCase());
			}
		};

		Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

		upperCaseConsumer.andThen(printConsumer).accept(cities);
	}

	@Test
	public void supplier() {

		Supplier<Double> doubleSupplier1 = () -> Math.random();

		// Supplier para tipos primitivos e não classes -> double, int, long, boolean
		DoubleSupplier doubleSupplier2 = Math::random;

		System.out.println(doubleSupplier1.get());

		System.out.println(doubleSupplier2.getAsDouble());
	}

	@Test
	public void supplierComOptional() {

		Supplier<Double> doubleSupplier = () -> Math.random();

		Optional<Double> optionalDouble = Optional.empty();

		System.out.println(optionalDouble.orElseGet(doubleSupplier));
	}

	@Test
	public void testPredicate() {

		List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");

		// Criando um predicate para passar no filter
		Predicate<String> nameStartsWithS = str -> str.startsWith("S");

		names.stream().filter(nameStartsWithS).forEach(System.out::println);
	}

	@Test
	public void testPredicateAndComposition() {

		List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");

		Predicate<String> startPredicate = str -> str.startsWith("S");

		Predicate<String> lengthPredicate = str -> str.length() >= 5;

		// utilizando 2 predicates
		names.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);
	}

	@Test
	public void testFunctions() {

		List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");

		Function<String, Integer> nameMappingFunction = String::length;

		// A function tem o tipo que vai ser consumido e o retornado

		List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());

		System.out.println(nameLength);
	}

}
