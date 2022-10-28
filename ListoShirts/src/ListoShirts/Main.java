package ListoShirts;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


      //Criação da lista de produtos:
        List <Camisa> p = new ArrayList<>();

        p.add(new Camisa("Camisa SQL", 50.0));
        p.add(new Camisa("Camisa Java", 50.0));
        p.add(new Camisa("Camisa Python", 50.0));
        p.add(new Camisa("Camisa Linux", 35.0));
        p.add(new Camisa("Camisa Fadesp", 10.0));
        
        System.out.println("Olá! Bem vindo(a) a Listo Shirts!\r\n" + 
                "Estamos muito felizes de ter você conosco.\r\n" + 
                "Aqui está a nossa lista de produtos, \r\n" + 
                "Fique a vontade para escolher quais e quantos quiser.\r\n");
 
                        
        //For para mostrar os produtos:
        for(int c = 0; c <= p.size() -1; c++) {
            System.out.println( p.get(c).getModelo()+ " R$ " +  p.get(c).getValor());
        }
        //Poderia ter sido utilizado também:
        //p.forEach(item -> System.out.println(item));

        //For para receber a quantidade de cada produto:
        for(int c = 0; c <= p.size() -1; c++) {
            System.out.println("\r\nVocê deseja Quantas unidades da "+p.get(c).getModelo()+"? (digite um número)");
            p.get(c).setQtd(sc.nextInt()); 
        }
        
        //Lógica do valor total da compra:
        double total = 0;
        
        for(int c = 0; c <= p.size() -1; c++) {
            total = total + p.get(c).getQtd()*p.get(c).getValor();
        }
        
         System.out.println("\r\nValor total do seu pedido: " + total + " reais.");


        //If-Else para aplicar desconto em cima do valor total da compra:
        if(total<150.0){
            total -= 10.0;
            System.out.println("Você ganhou 10 reais de desconto, portanto seu valor final é: " + total + " reais");
         }
         else if(total>=150.0){
             total -= total*20.0/100.0;
             System.out.println("Você ganhou 20% de desconto, portanto o valor final da sua compra é de: " + total + " reais.");
         }
        
        sc.close();
    }

}
