package mc646.cucumberExample;

public class Produto {

	private String nome;
	private float percMaterialImport;
	private float preco;
	
	public Produto(String nome, float percMaterialImport, float preco) {
		super();
		this.nome = nome;
		this.percMaterialImport = percMaterialImport;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPercMaterialImport() {
		return percMaterialImport;
	}

	public void setPercMaterialImport(float percMaterialImport) {
		this.percMaterialImport = percMaterialImport;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}
