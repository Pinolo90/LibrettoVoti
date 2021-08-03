package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {

		Libretto libretto = new Libretto();

		voto voto1 = new voto("Matematica", 30, LocalDate.of(2021, 6, 13));
		voto voto2 = new voto("Storia", 26, LocalDate.of(2021, 6, 13));
		voto voto3 = new voto("Italiano", 21, LocalDate.of(2021, 6, 13));

		libretto.add(voto1);
		libretto.add(voto2);
		libretto.add(voto3);

		System.out.println(libretto.toString());
		
		System.out.println(libretto.votiUguali(21));

	}

}
