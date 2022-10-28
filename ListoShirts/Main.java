package ListoShirts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                    
    Scanner sc = new Scanner(System.in);
    
    //Declaração dos produtos:
    Camisa a1 = new Camisa();
    a1.setModelo("SQL");
    a1.getValor();
    
    Camisa a2 = new Camisa();
    a2.setModelo("Java"); 
    a2.getValor();
    
    Camisa a3 = new Camisa();
    a3.setModelo("Python");
    a3.getValor();
    
    Camisa a4 = new Camisa();
     a4.setModelo("Fadesp");
     a4.getValor();
     
     sc.close();

 }
}








// "Cupom":
//if(Total<150){(Total-10);}else if(Total>=150){(Total*20)/100;}

