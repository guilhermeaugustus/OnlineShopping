package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccount;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	CreateAccount account = new CreateAccount();

	@Given("esteja na tela de cadastro de clientes")
	public void esteja_na_tela_de_cadastro_de_clientes() {
		metodos.abrirNavegador("http://advantageonlineshopping.com/", "CHROME", "acessando site da loja");
	}

	@When("informar todos os dados obrigatorios")
	public void informar_todos_os_dados_obrigatorios() {

		account.criarConta("guilhermeaugustus98@gmail.com", "G@gus17", "G@gus17", "Guilherme", "Augustus", "11940053248",
				"Brazil", "São Paulo", "praca da se", "SP", "01001000");

	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() {

		account.validarUser();
	}

}

// 
