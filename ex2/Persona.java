package ex2;

public class Persona {
	private String nom;
	private String cognom;
	private int edat;

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
