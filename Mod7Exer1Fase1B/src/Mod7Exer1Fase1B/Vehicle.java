package Mod7Exer1Fase1B;

//Definició clase Vehicle
public class Vehicle {
    
    //Definició de camps de clase
    protected String plate;
    protected String brand;
    protected String color;
    
    //Definició de constructor i paràmetres
    public Vehicle(String plate, String brand, String color) {
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }
    
    
    //Setters i getters
    public void setMaTricula(String plate){
        this.plate = plate;
    }
        
    public String getMatricula(){
        return plate;
    }
        
    public void setMarca(String brand){
        this.brand = brand;
    }
        
    public String getMarca(){
        return brand;
    }
        
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    //Retorna les característiques de vehicle per consola
    @Override
    public String toString(){
        return "El vehícle té matrícula: " + plate + ", de marca: " + brand +
                ", i color: " + color;
    }

}     




