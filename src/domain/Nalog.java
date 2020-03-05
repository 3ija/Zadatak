package domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Nalog {
	@Id
	@JoinColumn(name = "NALOG_ID")
	private Korisnik korisnik;
	private String username;
	private String password;
	private boolean active;
	
	@ManyToMany
    @JoinTable(
        name = "NALOG_ROLE", 
        joinColumns = { @JoinColumn(name = "NALOG_ID") }, 
        inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") }
    )
	private Set<Role> role;
	
	
	public Nalog() {
	}
	
	public Nalog(Korisnik korisnik, String username, String password) {
		super();
		this.korisnik = korisnik;
		this.username = username;
		this.password = password;
		this.active = true;
		this.role = new HashSet<Role>();
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((korisnik == null) ? 0 : korisnik.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Nalog))
			return false;
		Nalog other = (Nalog) obj;
		if (active != other.active)
			return false;
		if (korisnik == null) {
			if (other.korisnik != null)
				return false;
		} else if (!korisnik.equals(other.korisnik))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nalog [korisnik=" + korisnik + ", username=" + username + ", password=" + password + ", active="
				+ active + "]";
	}
	
	
	
	
	
	
}
