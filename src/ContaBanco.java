import dao.ContaBean;
import service.ContaService;

public class ContaBanco {
    public static void main(String[] args) {
        // Conhecer e importar a classe scanner
        // Exibir as mensagens para nosso usuário
        // Obter pela Scanner os valores digitados no terminal
        ContaService contaService = new ContaService();
        ContaBean contaBean = contaService.criarConta();

        // TODO: Exibir a mensagem Conta Criada
        System.out.print("Conta ");
        System.out.print(contaBean.getTipoConta());
        System.out.println(" criada com sucesso!");
        System.out.println("********** Dados da conta criada **********");

        System.out.println("  ");

        System.out.print("Cliente: ");
        System.out.print(contaBean.getCliente().getCodigoCliente());
        System.out.print(" - ");
        System.out.println(contaBean.getCliente().getNomeCliente());

        System.out.println(" ");

        System.out.print("Banco: ");
        System.out.print(contaBean.getAgencia().getBanco().getCodigoBanco());
        System.out.print(" - ");
        System.out.println(contaBean.getAgencia().getBanco().getNomeBanco());

        System.out.println(" ");

        System.out.print("Agência: ");
        System.out.print(contaBean.getAgencia().getNumeroAgencia());
        System.out.print("-");
        System.out.print(contaBean.getAgencia().getDigitoAgencia());
        System.out.print(" - ");
        System.out.println(contaBean.getAgencia().getNomeAgencia());

        System.out.println(" ");

        System.out.print("Tipo da conta: ");
        System.out.println(contaBean.getTipoConta());

        System.out.println(" ");

        System.out.print("Conta: ");
        System.out.print(contaBean.getNumeroConta());
        System.out.print("-");
        System.out.println(contaBean.getDigitoConta());

        System.out.println(" ");

    }
}