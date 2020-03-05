package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE_ID")
	private long id;
	
	private Korisnik korisnik;
	private RolePermission rolePerm;
	private boolean enable;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(long id, Korisnik korisnik, RolePermission rolePerm, boolean enable) {
		super();
		this.id = id;
		this.korisnik = korisnik;
		this.rolePerm = rolePerm;
		this.enable = enable;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public RolePermission getRolePerm() {
		return rolePerm;
	}
	public void setRolePerm(RolePermission rolePerm) {
		this.rolePerm = rolePerm;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", korisnik=" + korisnik + ", rolePerm=" + rolePerm + ", enable=" + enable + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (enable ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((korisnik == null) ? 0 : korisnik.hashCode());
		result = prime * result + ((rolePerm == null) ? 0 : rolePerm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Role))
			return false;
		Role other = (Role) obj;
		if (enable != other.enable)
			return false;
		if (id != other.id)
			return false;
		if (korisnik == null) {
			if (other.korisnik != null)
				return false;
		} else if (!korisnik.equals(other.korisnik))
			return false;
		if (rolePerm != other.rolePerm)
			return false;
		return true;
	}
	
	
}
