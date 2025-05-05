package service;

import dao.ContaBean;

import java.util.Scanner;

public class ContaService {
    ContaBean conta;
    Integer numCliente = 0;
    Integer numConta = 0;
    Scanner myObjScner = new Scanner(System.in);  // Create a Scanner object

    public ContaBean criarConta() {
        conta = new ContaBean();

        try {

            System.out.println("Digite o nome do cliente: ");
            conta.getCliente().setNomeCliente(myObjScner.nextLine());

            System.out.println("Digite o código da agência: ");
            conta.getAgencia().setNumeroAgencia(myObjScner.nextInt());

            System.out.println("Digite o tipo de conta: ");
            conta.setTipoConta(myObjScner.nextLine());

            numCliente++;
            conta.getCliente().setCodigoCliente(numCliente);

            if (conta.getAgencia().getNumeroAgencia() == 1) {
                conta.getAgencia().setNomeAgencia("MATRIZ");
            }
            else if (conta.getAgencia().getNumeroAgencia() == 1382) {
                conta.getAgencia().setNomeAgencia("ALPHAVILLE - ALAM. RIO NEGRO");
            }
            else {
                conta.getAgencia().setNomeAgencia("OUTRA AGÊNCIA");
            }

            conta.getAgencia().getBanco().setCodigoBanco("237");
            conta.getAgencia().getBanco().setNomeBanco("BRADESCO");;

            numConta++;

            conta.setNumeroConta(202505000 + numConta);

        } catch (Exception e) {
            e.printStackTrace();

        }
        finally {
            return conta;

        }
    }



}
