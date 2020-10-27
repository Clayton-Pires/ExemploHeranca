package core;
// aqui o operador extends pode ser lido da seguinte forma
// o tipo 
public class Estudante extends Pessoa{
	private String curso;
	private int numeroMatricula;
	
	
	public void exibirInfo() {
		System.out.println("Nome:"+nome+" / " +email+" ("+telefone+") "+numeroMatricula+" / "+curso);
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	

}
