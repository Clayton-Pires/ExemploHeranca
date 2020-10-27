package userInterface;
import core.Estudante;
import core.Pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Isisdro");
		p1.setEmail("teste.email@teste");
		p1.setTelefone("98733-0000");
				
		Estudante e1 = new Estudante(); 
		
		p1.setNome("Clayton");
		p1.setEmail("teste2@email");
		p1.setTelefone("45673-9999");
		e1.setCurso("Computação");
		e1.setNumeroMatricula(1234);
		
				
		p1.exibirInfo();
		e1.exibirInfo();
	}
}
