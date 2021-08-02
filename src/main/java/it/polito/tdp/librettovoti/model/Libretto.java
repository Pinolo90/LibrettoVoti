package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<voto> voti = new ArrayList<voto>();

	public Libretto() {
		super();
	}

	public Libretto(List<voto> voti) {
		super();
		this.voti = voti;
	}

	public void add(voto v) {
		this.voti.add(v);
	}

	@Override
	public String toString() {
		return "Libretto [voti=" + voti + "]";
	}

}
