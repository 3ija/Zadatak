package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Odsek {
	@Id
	@Column(name = "ODSEK_ID")
	private long id;
	@Column(unique = true)
	private String naziv;
	
	public Odsek() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Odsek(long id, String naziv) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Odsek))
			return false;
		Odsek other = (Odsek) obj;
		if (id != other.id)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Odsek [id=" + id + ", naziv=" + naziv + "]";
	}
	
	
	
}
