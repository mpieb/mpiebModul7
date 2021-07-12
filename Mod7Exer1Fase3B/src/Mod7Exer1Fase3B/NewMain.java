package Mod7Exer1Fase3B;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        System.out.println("Quin tipus de vehicle vols?");
        System.out.println("1. Car");
        System.out.println("2. Bike");
    
    Scanner lector = new Scanner(System.in);
    
    int decisio = lector.nextInt();
    
    if (decisio == 1){
        Vehicle nouCotxe = new Car("1234", "HOT", "Sireres", "Blanc");
        try{
        nouCotxe.setMatriculaNombre("1234");
        }catch(Exception e){
            System.out.println("S´han de possar cuatre nombres enters!");
        }
        try{
        nouCotxe.setMatriculaChar("HOT");   
        }catch(Exception e){
            System.out.println("S´han de possar dos o tres lletres majúscules");
        }
        
        System.out.println(nouCotxe);
        
        Wheel nouCotxeRodesDarrere = new WheelDarrere("Parelli", 2.2);
        try{
        nouCotxeRodesDarrere.setDiameter(2.2);
        }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println(nouCotxeRodesDarrere);
        
        Wheel nouCotxeRodesDavant =new WheelDavant("Machelin", 1.9);
        try{
        nouCotxeRodesDavant.setDiameter(1.9);
        }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println(nouCotxeRodesDavant);
        
        }else if(decisio == 2){
        Vehicle novaMoto = new Bike("9876", "MOT", "Magneti Marilli", "Negre");
        try{
        novaMoto.setMatriculaNombre("9876");
        }catch(Exception e){
            System.out.println("S´han de possar cuatre nombres enters!");
        }
        try{
        novaMoto.setMatriculaChar("MOT");   
        }catch(Exception e){
            System.out.println("S´han de possar dos o tres lletres majúscules");
        }
        
        System.out.println(novaMoto);
        
        Wheel novaMotoRodesDarrere = new WheelDarrere("Machelin", 0.9);
        try{
        novaMotoRodesDarrere.setDiameter(0.9);
        }catch(Exception e){
        System.out.println("El diàmetre de la roda del darrere ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println(novaMotoRodesDarrere);
        
        Wheel novaMotoRodesDavant = new WheelDavant("Machelin", 0.7);
        try{
        novaMotoRodesDavant.setDiameter(0.7);
        }catch(Exception e){
            System.out.println("El diàmetre de la roda del davant ha de ser major de 0,4 i menor de 4");
        }
    
        System.out.println(novaMotoRodesDavant);
        
        } else {
            System.out.println("S´ha de triar cotxe o moto!");
        }
    lector.close();
    }

}





