package main.AbstractFactory;

public class FaturaPlanoPremium implements Fatura{

  @Override
  public String gerarFatura() {
    return "Plano Premium: R$60,00";
  }
}
