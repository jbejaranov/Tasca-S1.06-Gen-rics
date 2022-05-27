package ex1;

public class NoGenericMethods {

	String marca;
	String modelo;

	int anyFabricacio;
	int anyMatriculacio;

	public NoGenericMethods(String marca, String modelo) {

		this.marca = marca;
		this.modelo = modelo;
	}

	public NoGenericMethods(int anyFabricacio, int anyMatriculacio) {

		this.anyFabricacio = anyFabricacio;
		this.anyMatriculacio = anyMatriculacio;
	}

	public NoGenericMethods(String marca, int anyMatriculacio) {

		this.marca = marca;
		this.anyMatriculacio = anyMatriculacio;
	}

}
