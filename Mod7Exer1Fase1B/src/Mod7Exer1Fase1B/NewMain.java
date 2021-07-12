package Mod7Exer1Fase1B;

public class NewMain {

    public static void main(String[] args) {
    //Poliformisme
    Vehicle nouVehicle = new Car("1234 GMT", "Alfa Mateu", "Blanc");
    System.out.println(nouVehicle);
    
    Wheel rodesTraseres = new WheelDarrere("Parelli", 1.2);
    System.out.println(rodesTraseres);
    
    Wheel rodesDavanteres = new WheelDavant("Machelin", 1.4);
    System.out.println(rodesDavanteres);
    }
    
}

        
    
    

