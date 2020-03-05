package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ispit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date datumPolaganja;
	
	@ManyToOne
	@JoinColumn(name = "PROFESOR_ID")
	private Profesor profesor;
	
	@ManyToOne
	@JoinColumn(name = "PREDMET_ID")
	private Predmet predmet;
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	
	private int ocena;
	
	public Ispit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ispit(long id, Date datumPolaganja, Profesor profesor, Predmet predmet, Student student, int ocena) {
		super();
		this.id = id;
		this.datumPolaganja = datumPolaganja;
		this.profesor = profesor;
		this.predmet = predmet;
		this.student = student;
		this.ocena = ocena;
	}
	
	public Ispit(Date datumPolaganja, Profesor profesor, Predmet predmet, Student student, int ocena) {
		this.datumPolaganja = datumPolaganja;
		this.profesor = profesor;
		this.predmet = predmet;
		this.student = student;
		this.ocena = ocena;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDatumPolaganja() {
		return datumPolaganja;
	}

	public void setDatumPolaganja(Date datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumPolaganja == null) ? 0 : datumPolaganja.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ocena;
		result = prime * result + ((predmet == null) ? 0 : predmet.hashCode());
		result = prime * result + ((profesor == null) ? 0 : profesor.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ispit))
			return false;
		Ispit other = (Ispit) obj;
		if (datumPolaganja == null) {
			if (other.datumPolaganja != null)
				return false;
		} else if (!datumPolaganja.equals(other.datumPolaganja))
			return false;
		if (id != other.id)
			return false;
		if (ocena != other.ocena)
			return false;
		if (predmet == null) {
			if (other.predmet != null)
				return false;
		} else if (!predmet.equals(other.predmet))
			return false;
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ispit [id=" + id + ", datumPolaganja=" + datumPolaganja + ", profesor=" + profesor + ", predmet="
				+ predmet + ", student=" + student + ", ocena=" + ocena + "]";
	}
	
	
	
}
