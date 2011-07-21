/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eshtacs;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Jose Pabo Castillo jaypicastillo
 */
public class Driver_Eshtacs {

    	public static void Menu(){
                System.out.println("------------------------------------------------------");
		System.out.println("-------------------    Menu    -----------------------");
		System.out.println("-------------------------------------Ingrese Opc.-----");
		System.out.println(" (1) Operandos                                        ");
		System.out.println(" (3) Operadores                                       ");
		System.out.println(" (4) Salir                                            ");
		System.out.println("------------------------------------------------------");
	}
        public static void Oper(){
                System.out.println("  Ingrese Operando:                                   ");
        }
        public static void Instru(){
                System.out.println("------------------------------------------------------");
                System.out.println("-------------------- Instrucciones  ------------------");
                System.out.println("------------------------------------------------------");
                System.out.println("---Seleccione la Operacion que desea Realizar para ---");
                System.out.println("---Ingresar-------------------------------------------");
                System.out.println("------------------------------------------------------");
        }
        public static double Ingre(String msg, String err,double inf, double sup){
                Scanner in = new Scanner(System.in);
                double  ing=-1000;
                while(!((inf<=ing)&&(ing<=sup))){
                    System.out.println(msg);
                    try{
                       ing = in.nextDouble();
                    }catch (InputMismatchException E){
                        System.out.println(err);
                    }
                    in.nextLine();
                }
            return ing;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double opcion;
        Instru();
        Menu();
        opcion=Ingre("Ingrese Opcion","Fail, Ingrese Un Entero Valido",1,3);
        switch((int)opcion){
            case 1:

        }











    }
}
