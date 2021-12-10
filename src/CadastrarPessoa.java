import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CadastrarPessoa {
	public static void main(String[] args) throws IOException {
		
		Pessoa novaPessoa;
		String nome;
		String endereco;
		int idade;
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite o nome da pessoa: ");
		nome = scan.readLine();
		System.out.print("Digite o endereço: ");
		endereco = scan.readLine();
		System.out.print("Digite a idade: ");
		idade = scan.read();
		novaPessoa = new Pessoa(nome, endereco, idade);
		System.out.print("A pessoa cadastrada é: ");
		System.out.print(novaPessoa.getName()+ " - ");
		System.out.print(novaPessoa.getEndereco()+" - ");
		System.out.print(novaPessoa.getIdade());
	}
	
	
}
