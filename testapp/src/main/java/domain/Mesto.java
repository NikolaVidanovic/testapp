package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mesto {

	@Id
	private Long pttBroj;
	private String naziv;
	
	public Mesto(Long pttBroj, String naziv) {
		super();
		this.pttBroj = pttBroj;
		this.naziv = naziv;
	}

	public Mesto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPttBroj() {
		return pttBroj;
	}

	public void setPttBroj(Long pttBroj) {
		this.pttBroj = pttBroj;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Mesto [pttBroj=" + pttBroj + ", naziv=" + naziv + "]";
	}
	
}
