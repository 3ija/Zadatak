package domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Smer {
	@Id
	@Column(name = "SMER_ID")
	private long id;
	private String naziv;
	
	@ManyToOne
	@JoinColumn(name = "ODSEK_ID")
	private Odsek odsek;
	
	@ManyToMany(mappedBy = "smer")
	private Set<Predmet> predmeti;
	
	public Smer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Smer(long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
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
	public Odsek getOdsek() {
		return odsek;
	}
	public void setOdsek(Odsek odsek) {
		this.odsek = odsek;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((odsek == null) ? 0 : odsek.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Smer))
			return false;
		Smer other = (Smer) obj;
		if (id != other.id)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (odsek == null) {
			if (other.odsek != null)
				return false;
		} else if (!odsek.equals(other.odsek))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Smer [id=" + id + ", naziv=" + naziv + ", odsek=" + odsek + "]";
	}
	
	
	
	
	
}
