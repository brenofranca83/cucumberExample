Feature: Imposto de venda
	Eu como analista fiscal, gostaria de automatizar o cálculo de impostos devidos, 
	de forma que o imposto por produto seja calculado automaticamente durante a emissão da nota fiscal de venda

	Scenario: Calcular valor final da nota de um Painel Inteligente com imposto
		# Valor de imposto sobre produtos muda de acordo com a quantidade matéria prima importada utilizada no produto 
		Given Compra de um Painel Inteligente com 95% de material importado e preço 1000 
		When Emitir a nota fiscal de venda
		Then Verificar o valor final do Painel Inteligente igual a 1110 

# Tabela de imposto:
# - Menos de 10% de matéria prima importada - isento
# - Entre 10% e 30% de matéria prima importada - imposto de 3%
# - Entre 31% e 50% de matéria prima importada - imposto de 5%
# - Entre 51% e 80% de matéria prima importada - imposto de 8%
# - Mais de 80% de matéria prima importada     - imposto de 11%

  Scenario Outline: Calcular valor final da nota de um produto com imposto
    Given compra do produto <nome> com <percentual_importado> de material importado e preço <preco>
    When emitir a nota fiscal para a venda
    Then verificar se o valor final do produto igual a <preco_final> 

    Examples: 
      | nome                    | percentual_importado | preco | preco_final |
      | "Serra Elétrica"        |     45               | 400   | 420         |
      | "Motor de empilhadeira" |     14               | 6000  | 6180        |
      | "Rastreador aquático"   |     85               | 600   | 666         |
      | "Bomba de infusão"      |     65               | 7000  | 7560        |
      | "Tambor metálico"       |     0                | 100   | 100         |
      | "Painel inteligente"    |     95               | 1000  | 1110        |
      | "Kit rolamento"         |     25               | 80    | 82.4        |

    