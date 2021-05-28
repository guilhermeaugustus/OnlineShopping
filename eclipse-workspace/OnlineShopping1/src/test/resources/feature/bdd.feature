#Author: guilhermeaugustus98@gmail.com
@tag
Feature: Cadastro de clientes
  Eu como usuario quero fazer o cadastro de cliente para utilizacao do site

  @tag1
  Scenario: Cadastro e clientes
    Given esteja na tela de cadastro de clientes
    When informar todos os dados obrigatorios
    Then cadastro realizado com sucesso
  

