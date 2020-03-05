package domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")  
public class Profesor extends Korisnik {
	
	private String ime;
	private String prezime;
	@Enumerated(EnumType.STRING)
	private Zvanje zvanje;
	private Date zasnivanjeRadnogOdnosa;
	
	@ManyToOne
	@JoinColumn(name = "ODSEK_ID")
	private Odsek odsek;
	
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Profesor(String ime, String prezime, Zvanje zvanje, Date zasnivanjeRadnogOdnosa, Odsek odsek) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zvanje = zvanje;
		this.zasnivanjeRadnogOdnosa = zasnivanjeRadnogOdnosa;
		this.odsek = odsek;
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

	public Zvanje getZvanje() {
		return zvanje;
	}

	public void setZvanje(Zvanje zvanje) {
		this.zvanje = zvanje;
	}

	public Date getZasnivanjeRadnogOdnosa() {
		return zasnivanjeRadnogOdnosa;
	}

	public void setZasnivanjeRadnogOdnosa(Date zasnivanjeRadnogOdnosa) {
		this.zasnivanjeRadnogOdnosa = zasnivanjeRadnogOdnosa;
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
		int result = super.hashCode();
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((odsek == null) ? 0 : odsek.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		result = prime * result + ((zasnivanjeRadnogOdnosa == null) ? 0 : zasnivanjeRadnogOdnosa.hashCode());
		result = prime * result + ((zvanje == null) ? 0 : zvanje.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Profesor))
			return false;
		Profesor other = (Profesor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (odsek == null) {
			if (other.odsek != null)
				return false;
		} else if (!odsek.equals(other.odsek))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		if (zasnivanjeRadnogOdnosa == null) {
			if (other.zasnivanjeRadnogOdnosa != null)
				return false;
		} else if (!zasnivanjeRadnogOdnosa.equals(other.zasnivanjeRadnogOdnosa))
			return false;
		if (zvanje != other.zvanje)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profesor [ime=" + ime + ", prezime=" + prezime + ", zvanje=" + zvanje + ", zasnivanjeRadnogOdnosa="
				+ zasnivanjeRadnogOdnosa + ", odsek=" + odsek + "]";
	}
	
	
	
	
}
