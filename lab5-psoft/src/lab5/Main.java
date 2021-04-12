package lab5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Digite o meio de transporte:\n\t (1) Pedestre " +
                    "\n\t (2) Carro\n\t (3) Moto\n\t (4) Ônibus\n\t (5) Metrô\n\t (0) Sair");
            int opcaoTransporte = sc.nextInt();

            if(opcaoTransporte == 0) break;

            try {
                TipoTransporte tipoTransporte = TipoTransporte.values()[opcaoTransporte - 1];
                Transporte meioDeTransporte = tipoTransporte.getTipoTransporte();
                System.out.println(meioDeTransporte.mensagemRota());
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Opção inválida!");
            }


        }
    }
}
