import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Pedido> listaPedido = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        List<Integer> listaId = new ArrayList<>();
        List<String> listaTipoMadeira = new ArrayList<>();
        List<Double> listaPrecoVenda = new ArrayList<>();
        List<Double> listaPrecoProducao = new ArrayList<>();

        String x; // Variavel usada para acesso ao menu
        double precoTotalVenda, precoTotalProducao;
        precoTotalVenda = 0;
        precoTotalProducao = 0;

        for (int i=0; i<3; i++){
            int aux;
            String aux1;
            double aux2;
            double aux3;

            System.out.println("Digite o id d madeira: ");
            aux = input.nextInt();
            listaId.add(aux);
            input.nextLine();

            System.out.println("Digite o tipo da madeira: ");
            aux1 = input.nextLine();
            listaTipoMadeira.add(aux1);

            System.out.println("Digite o preco de produção da madeira: ");
            aux2 = input.nextDouble();
            listaPrecoProducao.add(aux2);
            input.nextLine();


            do {
                System.out.println("Digite o preço de venda da madeira: ");
                aux3 = input.nextDouble();
            }while (aux3<aux2);
                listaPrecoVenda.add(aux3);
                input.nextLine();
            precoTotalProducao += listaPrecoProducao.get(i);
            precoTotalVenda += listaPrecoVenda.get(i);

        }

        for (int i=0; i<3; i++){
            listaPedido.add(new Pedido(listaId.get(i),listaTipoMadeira.get(i), listaPrecoProducao.get(i), listaPrecoVenda.get(i)));
        }




        do {
            System.out.println("Digite a operação desejada: ");
            System.out.println("1 - para salvar os pedidos; ");
            System.out.println("2 - para mostrar os pedido arquivados; ");
            System.out.println("3 - para ordenar em forma crescente; ");
            System.out.println("4 - para ordenar em forma decrescente; ");
            System.out.println("5 - para exibir o lucro total da madeira; ");
            System.out.println("sair - para encerrar. ");

            x = input.nextLine();

            switch (x){
                case "1":


                    break;

                case "2":

                    break;

                case "3":
                    Collections.sort(listaPedido);
                    for (int i=0; i<3; i++){
                        System.out.println("Id: "+listaPedido.get(i).getId() + " Tipo Madeira: "+listaPedido.get(i).getTipoMadeira()+
                                " Preco produção: "+ listaPedido.get(i).getPrecoProducao()+ " Preco venda: "+ listaPedido.get(i).getPrecoVenda());
                    }

                    break;

                case "4":

                    Collections.sort(listaPedido, Collections.reverseOrder());
                    for (int i=0; i<3; i++){
                        System.out.println("Id: "+listaPedido.get(i).getId() + " Tipo Madeira: "+listaPedido.get(i).getTipoMadeira()+
                                " Preco produção: "+ listaPedido.get(i).getPrecoProducao()+ " Preco venda: "+ listaPedido.get(i).getPrecoVenda());
                    }

                    break;


                case "5":
                    try{
                        System.out.println("O lucro total foi de: "+(precoTotalVenda - precoTotalProducao));

                    }catch (ArithmeticException exception){
                        System.out.println("Não existe divisão por zero! ");
                    }

                    break;

                default:
                    if (x.equals("sair"))
                        System.out.println("Obrigado por usar nossos serviços. ");
                    else System.out.println("Entrada invalida! Tente novamente. ");
                    break;
            }
        }while (!(x.equals("sair")));
        input.close();
    }


}
