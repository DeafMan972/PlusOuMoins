import java.util.*;

public class Pom{

    static char reponse;
    static int nombre = 0;
    static int nombre2 = (int) Math.random();

    public static void LancerProgramme(){

        Scanner sc = new Scanner(System.in);

           System.out.println("Voulez-vous commencer le jeu? (O/N).");

        reponse = sc.next().charAt(0);

        while(reponse != 'O' && reponse !=  'N'){
            
            if(reponse == 'O'){
                System.out.println("Choissez un nombre");
 
                while(nombre == nombre2){
 
                if (nombre > nombre2){
                    System.out.println("C'est plus");
                }
 
                else if (nombre < nombre2){
                    System.out.println("C'est moins");
                }
 
             }
         }
             
         if(nombre == nombre2){
             System.out.println("Bravo");
        }   

            else if(reponse == 'N'){
                LancerProgramme();
            }
            else{
                LancerProgramme();
            }
        }

           
    }

    public static void main (String[]args){
        LancerProgramme();
    }



}