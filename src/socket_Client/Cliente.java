package socket_Client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Cliente {
    public static void main(String[] args)  {

        try {
            Socket cliente = new Socket("localhost", 5225);
            System.out.println("Cliente conectado ao servidor");

            PrintStream saida = new PrintStream(cliente.getOutputStream());
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite seu numero:");
            while(teclado.hasNextInt()){
                saida.println(teclado.nextInt());

            }

        } catch (IOException e) {
            System.out.print("Erro ao conectar com o servidor");
        }


    }
}