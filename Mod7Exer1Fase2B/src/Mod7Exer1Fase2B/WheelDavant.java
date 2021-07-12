package Mod7Exer1Fase2B;

//Defició de clase
public class WheelDavant extends Wheel {
    //Constructor
    public WheelDavant(String brand, double diameter){
        //Crida a clase pare
        super(brand, diameter);
    }
    
    //Retorn de dades per consola
    @Override
    public String toString(){
        return "Les rodes del davant són de marca: " + brand + 
                ", i diàmetre de: " + diameter + " polzades";
    }
    
}

