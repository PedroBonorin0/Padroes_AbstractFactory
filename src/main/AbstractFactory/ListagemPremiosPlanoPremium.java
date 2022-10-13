package main.AbstractFactory;

public class ListagemPremiosPlanoPremium implements ListagemPremios{
  @Override
  public String listarPremios() {
    return "Prêmios Plano Premium: 20% desconto em jogos e produtos no site e acesso aos treinos do time";
  }
}
