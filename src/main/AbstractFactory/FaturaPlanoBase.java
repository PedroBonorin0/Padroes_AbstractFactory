package main.AbstractFactory;

public class FaturaPlanoBase implements Fatura{

  @Override
  public String gerarFatura() {
    return "Plano Base: R$30,00";
  }
}
