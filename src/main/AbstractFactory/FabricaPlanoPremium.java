package main.AbstractFactory;

public class FabricaPlanoPremium implements FabricaAbstrata{
  @Override
  public Fatura geraFatura() {
    return new FaturaPlanoPremium();
  }

  @Override
  public ListagemPremios listaPremios() {
    return new ListagemPremiosPlanoPremium();
  }
}
