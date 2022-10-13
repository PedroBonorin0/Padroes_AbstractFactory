package test.AbstractFactory;

import main.AbstractFactory.Cliente;
import main.AbstractFactory.FabricaAbstrata;
import main.AbstractFactory.FabricaPlanoBase;
import main.AbstractFactory.FabricaPlanoPremium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

  @Test
  void deveGerarFaturaPlanoBase() {
    FabricaAbstrata fabrica = new FabricaPlanoBase();
    Cliente cliente = new Cliente(fabrica);
    assertEquals("Plano Base: R$30,00", cliente.gerarFatura());
  }

  @Test
  void deveGerarFaturaPlanoPremium() {
    FabricaAbstrata fabrica = new FabricaPlanoPremium();
    Cliente cliente = new Cliente(fabrica);
    assertEquals("Plano Premium: R$60,00", cliente.gerarFatura());
  }

  @Test
  void deveListarPremiosPlanoBase() {
    FabricaAbstrata fabrica = new FabricaPlanoBase();
    Cliente cliente = new Cliente(fabrica);
    String texto = "Prêmios Plano Base: 10% desconto em jogos e produtos no site";
    assertEquals(texto, cliente.listarPremios());
  }

  @Test
  void deveListarPremiosPlanoPremium() {
    FabricaAbstrata fabrica = new FabricaPlanoPremium();
    Cliente cliente = new Cliente(fabrica);
    String texto = "Prêmios Plano Premium: 20% desconto em jogos e produtos no site e acesso aos treinos do time";
    assertEquals(texto, cliente.listarPremios());
  }

}