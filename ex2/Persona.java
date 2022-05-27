package ex2;

public class Persona {
	String nom;
	String cognom;
	int edat;

	public Persona() {

		nom = "Juan";
		cognom = "Bejarano";
		edat = 18;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + "]";
	}

}
