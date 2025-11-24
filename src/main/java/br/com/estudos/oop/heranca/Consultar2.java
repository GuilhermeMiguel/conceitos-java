package br.com.estudos.oop.heranca;

import java.time.LocalDate;

public class Consultar2 {

	public String consultarDataAtual() {
		LocalDate dataAtual = LocalDate.now();
		
		return "A Data atual é:" + dataAtual.getDayOfMonth() + "/" + dataAtual.getMonthValue() + "/" + dataAtual.getYear(); 
	}
}
