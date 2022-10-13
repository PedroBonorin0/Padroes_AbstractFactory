package main.AbstractFactory;

public class FabricaPlanoBase implements FabricaAbstrata{
  @Override
  public Fatura geraFatura() {
    return new FaturaPlanoBase();
  }

  @Override
  public ListagemPremios listaPremios() {
    return new ListagemPremiosPlanoBase();
  }
}
