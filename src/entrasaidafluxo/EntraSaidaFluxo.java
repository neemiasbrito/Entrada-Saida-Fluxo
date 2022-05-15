/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrasaidafluxo;

import java.util.Scanner;

/**
 *
 * @author HNROr
 */
public class EntraSaidaFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int idade = 0;
       
       Scanner sc = new Scanner (System.in); 
       
        System.out.println("DIGITE SEU NOME: ");
        String nome = sc.next();
       
        System.out.println("DIGITE A SUA IDADE: ");
        idade = sc.nextInt();
        
        if (idade <= 0)
            System.out.println("IDADE INVÁLIDA");
        
        
        if (idade >= 18 && idade < 70){
            System.out.println("MAIOR IDADE");
        }else if (idade >= 70){
            System.out.println("TERCEIRA IDADE");
    
         if (idade >= 100){
                System.out.println("CENTENÁRIO");
        }
            
        }else{
            System.out.println("MENOR IDADE");
        }
    }
    
}
