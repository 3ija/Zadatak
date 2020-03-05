package domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Predmet {
	@Id
	@Column(name = "PREDMET_ID")
	private long id;
	private String naziv;
	private int esp;
	private int semestar;
	
	@ManyToMany
    @JoinTable(
        name = "SMER_PREDMET", 
        joinColumns = { @JoinColumn(name = "PREDMET_ID") }, 
        inverseJoinColumns = { @JoinColumn(name = "SMER_ID") }
    )
	private Set<Smer> smer;
	
	public Predmet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Predmet(long id, String naziv, int esp) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.esp = esp;
		this.smer = new HashSet<Smer>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getEsp() {
		return esp;
	}

	public void setEsp(int esp) {
		this.esp = esp;
	}

	public Set<Smer> getSmer() {
		return smer;
	}

	public void setSmer(HashSet<Smer> smer) {
		this.smer = smer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + esp;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((smer == null) ? 0 : smer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Predmet))
			return false;
		Predmet other = (Predmet) obj;
		if (esp != other.esp)
			return false;
		if (id != other.id)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (smer == null) {
			if (other.smer != null)
				return false;
		} else if (!smer.equals(other.smer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Predmet [id=" + id + ", naziv=" + naziv + ", esp=" + esp + ", smer=" + smer + "]";
	}
	
	/*
	public void addSmer(Smer smer) {
		this.smer.add(smer);
	}
	*/
	
	
}
