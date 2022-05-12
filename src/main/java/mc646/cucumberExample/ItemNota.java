package mc646.cucumberExample;

public class ItemNota {

	private Produto prod;
	private int quant;
	
	public ItemNota(Produto prod, int quant) {
		this.prod = prod;
		this.quant = quant;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
}
