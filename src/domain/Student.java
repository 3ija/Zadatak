package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@PrimaryKeyJoinColumn(name="id")  
public class Student extends Korisnik {
	
	private String indeks;
	private String ime;
	private String prezime;
	
	@Temporal(TemporalType.DATE)
	private Date datumRodjenja;
	
	@ManyToOne
	@JoinColumn(name = "SMER_ID")
	private Smer smer;
	
	@OneToMany(mappedBy = "student", orphanRemoval = true)
	@JoinColumn(name= "STUDENT_ID",referencedColumnName = "INDEKS")
	private Set<Ispit> polozeniIspiti;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Student(String indeks, String ime, String prezime, Date datumRodjenja, Smer smer) {
		super();
		this.indeks = indeks;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.smer = smer;
		this.polozeniIspiti = new HashSet<Ispit>();
	}

	public String getIndeks() {
		return indeks;
	}

	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public Smer getSmer() {
		return smer;
	}

	public void setSmer(Smer smer) {
		this.smer = smer;
	}

	public Set<Ispit> getPolozeniIspiti() {
		return polozeniIspiti;
	}

	public void setPolozeniIspiti(Set<Ispit> polozeniIspiti) {
		this.polozeniIspiti = polozeniIspiti;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((datumRodjenja == null) ? 0 : datumRodjenja.hashCode());
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((indeks == null) ? 0 : indeks.hashCode());
		result = prime * result + ((polozeniIspiti == null) ? 0 : polozeniIspiti.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		result = prime * result + ((smer == null) ? 0 : smer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (datumRodjenja == null) {
			if (other.datumRodjenja != null)
				return false;
		} else if (!datumRodjenja.equals(other.datumRodjenja))
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (indeks == null) {
			if (other.indeks != null)
				return false;
		} else if (!indeks.equals(other.indeks))
			return false;
		if (polozeniIspiti == null) {
			if (other.polozeniIspiti != null)
				return false;
		} else if (!polozeniIspiti.equals(other.polozeniIspiti))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
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
		return "Student [indeks=" + indeks + ", ime=" + ime + ", prezime=" + prezime + ", datumRodjenja="
				+ datumRodjenja + ", smer=" + smer + ", polozeniIspiti=" + polozeniIspiti + "]";
	}
	
	
	
	
}
