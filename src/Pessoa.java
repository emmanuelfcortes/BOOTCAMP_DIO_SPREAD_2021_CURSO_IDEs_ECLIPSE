import java.util.Objects;

public class Pessoa {
	private String name;
	private String endereco;
	private int idade;
	public Pessoa(String name, String endereco, int idade) {
		this.name = name;
		this.endereco = endereco;
		this.idade = idade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Segunda [name=" + name + ", endereco=" + endereco + ", idade=" + idade + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(endereco, idade, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(endereco, other.endereco) && idade == other.idade && Objects.equals(name, other.name);
	}
	
	
}
