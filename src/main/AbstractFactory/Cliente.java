package main.AbstractFactory;

public class Cliente {

  private String nome;
  private String cpf;
  private String timeCoracao;
  private String email;

  private Fatura fatura;
  private ListagemPremios premios;

  public Cliente(FabricaAbstrata fabrica) {
    this.fatura = fabrica.geraFatura();
    this.premios = fabrica.listaPremios();
  }

  public String gerarFatura() {
    return this.fatura.gerarFatura();
  }

  public String listarPremios() {
    return this.premios.listarPremios();
  }

}
