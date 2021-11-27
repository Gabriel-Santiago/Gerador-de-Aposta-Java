package apostador;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Apostador {
    
    public static void loop(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Deseja jogar de novo?"
                + "Y - Yes"
                + "N - No");
        
        String loop = input.nextLine();
        
        if(null == loop){
            System.out.println("Comando inválido!");
        }else switch (loop) {
            case "Y", "y" -> sorteio();
            case "N", "n" -> System.out.println("Bye!");
            default ->  System.out.println("Tecla Inválida!");
        }
    }
    
    public static void sorteio_quina(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Bem vindo a Quina"
                    + "Digite quantos números vão ser escolhidos: ");
            int numbers = input.nextInt();
            
        if(numbers >= 5 && numbers <= 15){
            switch(numbers){
                case 5 ->{
                    Random random = new Random();
                    int array[] = new int[5];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 1,50");
                    loop();
                }
                case 6 ->{
                    Random random = new Random();
                    int array[] = new int[6];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 9,00");
                    loop();
                }
                case 7 ->{
                    Random random = new Random();
                    int array[] = new int[7];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 31,50");
                    loop();
                }
                case 8 ->{
                    Random random = new Random();
                    int array[] = new int[8];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 84,00");
                    loop();
                }
                case 9 ->{
                    Random random = new Random();
                    int array[] = new int[9];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 189,00");
                    loop();
                }
                case 10 ->{
                    Random random = new Random();
                    int array[] = new int[10];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 378,00");
                    loop();
                }
                case 11 ->{
                    Random random = new Random();
                    int array[] = new int[11];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 693,00");
                    loop();
                }
                case 12 ->{
                    Random random = new Random();
                    int array[] = new int[12];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 1188,00");
                    loop();
                }
                case 13 ->{
                    Random random = new Random();
                    int array[] = new int[13];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 1930,50");
                    loop();
                }
                case 14 ->{
                    Random random = new Random();
                    int array[] = new int[14];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 3003,00");
                    loop();
                }
                case 15 ->{
                    Random random = new Random();
                    int array[] = new int[15];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(79);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 4504,50");
                    loop();
                }   
            }
        }        
        }catch(InputMismatchException e){
            System.out.println("ERRO: Apenas número");
            sorteio_quina();
        }
    }
    
    public static void sorteio_lotomania(){
        try{
            System.out.println("Bem vindo a Lotomania!"
                    + "Serão sorteado os 50 números para você ganhar!");
            
            Random random = new Random();
            int array[] = new int[50];
            System.out.println("Os números para você ganhar são:");
            for (int i=0; i<array.length; i++) {
                array[i] = 1 + random.nextInt(99);
                System.out.print(" "+ array[i]);
            }
            System.out.println("\n O valor da aposta é R$ 1,50");
            loop();
            
        }catch(InputMismatchException e){
            System.out.println("ERRO: Apenas número");
            sorteio_lotomania();
        }
    }
    
    public static void sorteio_lotofacil(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Bem vindo a Lotofácil"
                    + "Digite quantos números vão ser escolhidos: ");
            int numbers = input.nextInt();
            
        if(numbers >= 15 && numbers <= 18){
            switch(numbers){
                case 15 ->{
                    Random random = new Random();
                    int array[] = new int[15];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(24);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 2,00");
                    loop();
                }
                case 16 ->{
                    Random random = new Random();
                    int array[] = new int[16];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(24);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 32,00");
                    loop();
                }
                case 17 ->{
                    Random random = new Random();
                    int array[] = new int[17];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(24);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 272,00");
                    loop();
                }
                case 18 ->{
                    Random random = new Random();
                    int array[] = new int[18];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(24);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 1632,00");
                    loop();
                }       
            }
        }
        }catch(InputMismatchException e){
            System.out.println("ERRO: Apenas número");
            sorteio_lotofacil();
        }
    }
    
    public static void sorteio_diaSorte(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Bem vindo ao Dia de Sorte!"
                    + "Digite quantos números vão ser escolhidos: ");
            int numbers = input.nextInt();
            
        if(numbers >= 7 && numbers <= 15){
            switch(numbers){
                case 7 ->{
                    Random random = new Random();
                    int array[] = new int[7];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 2,00");
                    loop();
                }
                case 8 ->{
                    Random random = new Random();
                    int array[] = new int[8];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 16,00");
                    loop();
                }
                case 9 ->{
                    Random random = new Random();
                    int array[] = new int[9];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 72,00");
                    loop();
                }
                case 10 ->{
                    Random random = new Random();
                    int array[] = new int[10];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(31);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 240,00");
                    loop();
                }
                case 11 ->{
                    Random random = new Random();
                    int array[] = new int[11];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 660,00");
                    loop();
                }
                case 12 ->{
                    Random random = new Random();
                    int array[] = new int[12];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 1584,00");
                    loop();
                }
                case 13 ->{
                    Random random = new Random();
                    int array[] = new int[13];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 3432,00");
                    loop();
                }
                case 14 ->{
                    Random random = new Random();
                    int array[] = new int[14];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 6864,00");
                    loop();
                }
                case 15 ->{
                    Random random = new Random();
                    int array[] = new int[15];
                    List<String> mes = Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro","novembro", "dezembro");
                    String mesSorte = mes.get(new Random().nextInt(mes.size()));
                    System.out.println("O mês da Sorte é " + mesSorte
                            + "Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(30);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 12870,00");
                    loop();
                }
            }
        }
        }catch(InputMismatchException e){
            System.out.println("ERRO: Apenas número");
            sorteio_diaSorte();
        }
    }
    
    public static void sorteio_megaSena(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Bem vindo a Mega Sena"
                    + "Digite quantos números vão ser escolhidos: ");
            int numbers = input.nextInt();
            
        if(numbers >= 6 && numbers <= 15){
            switch(numbers){
                case 6 ->{
                    Random random = new Random();
                    int array[] = new int[6];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 3,50");
                    loop();
                }
                case 7 ->{
                    Random random = new Random();
                    int array[] = new int[7];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 24,50");
                    loop();
                }
                case 8 ->{
                    Random random = new Random();
                    int array[] = new int[8];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 98,00");
                    loop();
                }
                case 9 ->{
                    Random random = new Random();
                    int array[] = new int[9];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 294,00");
                    loop();
                }
                case 10 ->{
                    Random random = new Random();
                    int array[] = new int[10];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 735,00");
                    loop();
                }
                case 11 ->{
                    Random random = new Random();
                    int array[] = new int[11];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 1617,00");
                    loop();
                }
                case 12 ->{
                    Random random = new Random();
                    int array[] = new int[12];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 3234,00");
                    loop();
                }
                case 13 ->{
                    Random random = new Random();
                    int array[] = new int[13];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 6006,00");
                    loop();
                }
                case 14 ->{
                    Random random = new Random();
                    int array[] = new int[14];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 10510,50");
                    loop();
                }
                case 15 ->{
                    Random random = new Random();
                    int array[] = new int[15];
                    System.out.println("Os números para você ganhar são:");
                    for (int i=0; i<array.length; i++) {
                        array[i] = 1 + random.nextInt(59);
                        System.out.print(" "+ array[i]);
                    }
                    System.out.println("\n O valor da aposta é R$ 17517,50");
                    loop();
                }   
            }
        }        
        }catch(InputMismatchException e){
            System.out.println("ERRO: Apenas número");
            sorteio_quina();
        }
    }
    
    public static void sorteio(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Deseja ganhar uma bolada???");
            System.out.println("Então escolha uma das opções abaixo e te mostraremos o resultado");
            System.out.println("1 - Quina\n"
                    + "2 - Lotomania\n"
                    + "3 - Lotofácil\n"
                    + "4 - Dia de Sorte\n"
                    + "5 - Mega Sena\n"
                    + ":");
            int choice = input.nextInt();
            
            switch(choice){
                case 1 ->{
                    sorteio_quina();
                    break;
                }
                case 2 ->{
                    sorteio_lotomania();
                    break;
                }
                case 3 ->{
                    sorteio_lotomania();
                    break;
                }
                case 4 ->{
                    sorteio_diaSorte();
                    break;
                }
                case 5 ->{
                    sorteio_megaSena();
                    break;
                }
                default ->{
                    System.out.println("Número inválido");
                    loop();
                }
            }
        }catch(InputMismatchException e){
            System.out.println("ERRO: Apenas número");
            sorteio();
        }
    }

    public static void main(String[] args) {
        sorteio();
    } 
}
