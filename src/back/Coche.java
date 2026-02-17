/*
 * Ambriz Cordero Diego Said
 * Medeles Bryan Jonathan
 * Rivera Andrade Jorge
 */
package back;

import java.util.Objects;

/**
 *
 * @author jra
 */
public class Coche extends Vehiculo {
    private String carroceria;
    
    public Coche(){
        super();
    }

    public Coche(String carroceria) {
        this.carroceria = carroceria;
    }

    public Coche(String carroceria, String matricula, String marca, String modelo, String ano, String color, double precio) {
        super(matricula, marca, modelo, ano, color, precio);
        this.carroceria = carroceria;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", color=" + color + ", precio=" + precio +  ", carroceria=" + carroceria + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + Objects.hashCode(this.modelo);
        hash = 71 * hash + Objects.hashCode(this.matricula);
        hash = 71 * hash + Objects.hashCode(this.carroceria);
        return hash;
    }
    
}
