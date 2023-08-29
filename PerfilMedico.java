package lp2;
 
public class PerfilMedico {
	private String Primernombre;
	private String Apellido;
	public String sexo;
	public int fechaNa;
	public double altura;
	public double peso;
	
	public PerfilMedico(String Primernombre, String Apellido, double altura, String sexo, int fechaNa, double peso){
		this.Primernombre = Primernombre;
		this.Apellido = Apellido;
		this.altura = altura;
		this.sexo =sexo;
		this.altura = altura;
		this.peso = peso;
	}

	public String getPrimernombre() {
		return Primernombre;
	}

	public void setPrimernombre(String primernombre) {
		Primernombre = primernombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getFechaNa() {
		return fechaNa;
	}

	public void setFechaNa(int fechaNa) {
		this.fechaNa = fechaNa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public static void main (String []args) {
		System.out.println("La altura y peso de " + Primernombre("Mauricio") + " es: " + altura(1.75) + peso(70));
	}
}
