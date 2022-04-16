package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Proizvodjac {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pib;
	private String maticniBroj;
	private String adresa;
	@OneToOne
	@JoinColumn(
			name="mesto",referencedColumnName = "pttBroj"
			)
	private Mesto mesto;
	
	public Proizvodjac(Long pib, String maticniBroj, String adresa, Mesto mesto) {
		super();
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.adresa = adresa;
		this.mesto = mesto;
	}
	
	public Proizvodjac(Long pib, String maticniBroj, String adresa) {
		super();
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.adresa = adresa;
	}


	public Proizvodjac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPib() {
		return pib;
	}
	public void setPib(Long pib) {
		this.pib = pib;
	}
	public String getMaticniBroj() {
		return maticniBroj;
	}
	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public Mesto getMesto() {
		return mesto;
	}
	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}
	@Override
	public String toString() {
		return "Proizvodjac [pib=" + pib + ", maticniBroj=" + maticniBroj + ", adresa=" + adresa + ", mesto=" + mesto
				+ "]";
	}
	
}
