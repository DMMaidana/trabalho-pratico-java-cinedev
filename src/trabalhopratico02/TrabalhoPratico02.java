
package trabalhopratico02;

import java.util.Scanner;
public class TrabalhoPratico02 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        // Definindo a Matriz
    String[][] assentos = new String[10][20];//Define matriz [10][20]
    
        //Inicializando assento como livre("|L|")
    for(int i = 0; i < assentos.length; i++){
        for(int j= 0; j< assentos[0].length; j++){
            assentos[i][j] = ("|L| ");
    }
        }
        
        //Variaveis usadas 
            int opcao;//Opção do menu
            int assentosOcupados = 0;//Contador de acentos ocupados
            int linhas = assentos.length;//Quantidade de fileiras
            int colunas = assentos[0].length;//Quantidade de assentos por fileira
            int assentosLivres = linhas * colunas;//contador de assento livres
            int assentosTotais = linhas * colunas;//contador de total de assentos
        
        //Inicio do programa
        System.out.println("Seja Bem Vindo(a) ao Cinedev.");
        
        //Loop do menu principal
            do{
        System.out.println(" ");
                
            System.out.println("O que voce deseja fazer?");
            System.out.println(" ");
                
                System.out.println("1)-Exibir Mapa de assentos- ");
                System.out.println("2)-Comprar ingressos- ");
                System.out.println("3)-Cancelar compra de ingressos- ");
                System.out.println("4)-Exibir Relatorio de ocupacao- ");
                System.out.println("5)-Sair- ");
        
                    opcao = teclado.nextInt();
        
    switch(opcao){
        case 1:
                
        //imprimindo o mapa de assentos
            System.out.println("Assentos:    1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20");
                for (int k = 0; k < assentos.length; k++) {
             
            System.out.printf("\n Fileira %2d:  ", k + 1 );
            
                for (int h = 0; h < assentos[0].length; h++) {
                
                System.out.print(assentos[k][h]);
  
    }
        }
         
            System.out.println();  // Quebra de linha 
         
            break;
         
        case 2:
        //Compra de ingressos
            System.out.println("Quantos ingressos deseja comprar? ");
                int nIngressos = teclado.nextInt();
        
            if(nIngressos > 1){
                
        //Compra de varios ingressos
            for(int i = 0; i < nIngressos; i++){
            
        //escolha da fileira
            System.out.println("Ingresso N: " + (i + 1) );
                int nFileira;
           
            System.out.println("Qual fileira voce deseja? ");
                nFileira = teclado.nextInt();
            
            if (nFileira < 1 || nFileira > linhas) {
                
            System.out.println("Fileira inválida.");
                i--; // repete a tentativa
            continue;
        }
            
        //Escolha do assento
            System.out.println("Qual o numero do assento desejado? ");
                int nAssento = teclado.nextInt();
                
            if (nAssento < 1 || nAssento > colunas) {
                
            System.out.println("Assento inválido.");
                i--; // repete a tentativa
            continue;
        }
                
        //Verifica assento
            if(assentos[nFileira - 1][nAssento - 1 ].equals("|X| ")){
                
            System.out.println("Esse assento ja esta ocupado.");
                    
        //Reserva o assento
            }else {
                assentos[nFileira - 1][nAssento - 1 ] = ("|X| ");
                
                    assentosOcupados += 1;
                    assentosLivres -= 1;
                
    }
        }
            
            }else{
            
        //Compra de 1 ingresso
            System.out.println("Qual fileira voce deseja? ");
                int nFileira = teclado.nextInt();
                
            if (nFileira < 1 || nFileira > linhas) {
                
            System.out.println("Fileira inválida.");
            continue;
        }
             
            System.out.println("Qual o numero do assento desejado? ");
                int nAssento = teclado.nextInt();
                
            if (nAssento < 1 || nAssento > colunas) {
                
            System.out.println("Assento inválido.");
            continue;
        }
            if(assentos[nFileira - 1][nAssento - 1 ].equals("|X| ")){
                
            System.out.println("Esse assento ja esta ocupado.");
            }else {
                
                assentos[nFileira - 1][nAssento - 1] = ("|X| ");
                    assentosOcupados += 1;
                    assentosLivres -= 1;
        }
    }
        
            break;
        case 3:
        //cancelamento de compra
            System.out.println("Quantos ingressos deseja cancelar?");
                int qtdCancelar = teclado.nextInt();
                
            if(qtdCancelar > 1){
        //Cancelando varios ingressos
            for(int i = 0;i < qtdCancelar;i++){
                        
                        
            System.out.println("Ingresso N: " + (i + 1));
                        
            System.out.println("Qual fileira voce deseja? ");
                int nFileira = teclado.nextInt();
                
            if (nFileira < 1 || nFileira > linhas) {
                
            System.out.println("Fileira inválida.");
                i--; // repete a tentativa
            continue;
        }
                
            System.out.println("Qual o numero do assento desejado? ");
                int nAssento = teclado.nextInt();
                
            if (nAssento < 1 || nAssento > colunas) {
                
            System.out.println("Assento inválido.");
            i--; // repete a tentativa
            continue;
        }
                //Verifica assento
                if(assentos[nFileira - 1][nAssento - 1 ].equals("|L| ")){
                    System.out.println("Esse assento nao esta ocupado.");
                    
                }else {
                //libera assento
                assentos[nFileira - 1][nAssento - 1 ] = ("|L| ");
                assentosOcupados -= 1;
                assentosLivres += 1;
                }
                    }
                    
                }else{
                    //Cancelando 1 ingresso
                    System.out.println("Qual fileira voce deseja? ");
                int nFileira = teclado.nextInt();
                
                if (nFileira < 1 || nFileira > linhas) {
            System.out.println("Fileira inválida.");
         
            continue;
        }
                
                System.out.println("Qual o numero do assento desejado? ");
                int nAssento = teclado.nextInt();
                
                if (nAssento < 1 || nAssento > colunas) {
            System.out.println("Assento inválido.");
           
            continue;
        }
                
                if(assentos[nFileira - 1][nAssento - 1 ].equals("|L| ")){
                    System.out.println("Esse assento nao esta ocupado.");
                }else {
                
                assentos[nFileira - 1][nAssento - 1] = ("|L| ");
                assentosOcupados -= 1;
                assentosLivres += 1;
        }
                    
    }
            break;
        case 4:
        //Relatorio de ocupação
                System.out.println("A sala tem ocupacao maxima de " + assentosTotais + " assentos.");
                System.out.println("Dos " + assentosTotais + " assentos, " + assentosOcupados + " Estao ocupados.");
                System.out.println("Dos " + assentosTotais + " assentos, " + assentosLivres + " Estao livres.");
                
                double percentualOcupado = (( (double ) assentosOcupados / assentosTotais)* 100);
                System.out.println("O percentual de ocupacao da sala e de " + percentualOcupado + "");
        }
        
    }
        while(opcao != 5); 
    }
}
 
