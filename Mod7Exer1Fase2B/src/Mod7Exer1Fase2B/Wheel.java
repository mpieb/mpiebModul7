package Mod7Exer1Fase2B;

//Definició de clase
public class Wheel {
    
    //Definició de variables de clase
    protected String brand;
    protected double diameter;
    
    //Definició de constructor i arguments
    public Wheel(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }
    
    //Setters i getters
    public void setMarca(String brand){
        this.brand = brand;
    }
    
    public String getMarca(){
        return brand;
    }
    
    public void setDiametre(double diameter){
        this.diameter = diameter;
    }
    
    public double getDiametre(){
        return diameter;
    }
    
}



