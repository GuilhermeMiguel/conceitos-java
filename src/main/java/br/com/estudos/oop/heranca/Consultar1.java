package br.com.estudos.oop.heranca;

import java.time.LocalDate;

public class Consultar1 {

	public String consultarDataAmanha() {
		
		var dataAtual = LocalDate.now().plusDays(1);
		
		return dataAtual.getDayOfMonth() + "/" + dataAtual.getMonthValue() + "/" + dataAtual.getYear(); 
	}
}
