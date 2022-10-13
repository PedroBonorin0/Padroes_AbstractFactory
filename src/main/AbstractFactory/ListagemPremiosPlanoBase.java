package main.AbstractFactory;

public class ListagemPremiosPlanoBase implements ListagemPremios{
  @Override
  public String listarPremios() {
    return "Prêmios Plano Base: 10% desconto em jogos e produtos no site";
  }
}
