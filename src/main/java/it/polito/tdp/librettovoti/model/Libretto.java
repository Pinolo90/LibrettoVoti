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

	public Libretto votiUguali(int votiUguali) {
		
		Libretto risultato = new Libretto();
		for (voto v : this.voti) {
			if (v.getVoto() == votiUguali) {
				risultato.add(v);
			}
		}
		return risultato;
	}

	@Override
	public String toString() {
		String risultato = "";
		for (voto v : this.voti) {
			risultato += v + "\n";
		}
		return risultato;
	}

}
