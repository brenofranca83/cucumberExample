package mc646.cucumberExample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class NotaFiscalStepDefinitions {

	NotaFiscal nota;
	float valorFinal;
	
	@Given("Compra de um Painel Inteligente com 95% de material importado e preço 1000")
	public void compra_Painel_Inteligente_95_1000() {
		Produto prod = new Produto("Painel Inteligente", 95f, 1000f);
		nota = new NotaFiscal();
		nota.addItem(new ItemNota(prod,1));
	}

	@When("Emitir a nota fiscal de venda")
	public void emitir_nota_fiscal_venda() {
	    valorFinal = nota.calcularValorFinal();
	}

	@Then("Verificar o valor final do Painel Inteligente igual a 1110")
	public void verificar_valor_final_painel_inteligente_1110() {
		assertEquals(1110f, valorFinal);
	}

	@Given("compra do produto {string} com {float} de material importado e preço {float}")
	public void compra_produto_com_percentual_importado_preco(String nome, float percentual_importado, float preco) {
		Produto prod = new Produto(nome, percentual_importado, preco);
		nota = new NotaFiscal();
		nota.addItem(new ItemNota(prod,1));
	}

	@When("emitir a nota fiscal para a venda")
	public void emitir_nota_fiscal_para_venda() {
	    valorFinal = nota.calcularValorFinal();
	}

	@Then("verificar se o valor final do produto igual a {float}")
	public void verificar_valor_final_produto_preco_final(float preco_final) {
		assertEquals(preco_final, valorFinal);
	}



}
