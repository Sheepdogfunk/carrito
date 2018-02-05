/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author killer
 */
public class Molde {
    public String marca, color, transmision;

public Molde () {
	marca = "Unknown";
	color = "Not Available";
	transmision="UnKnown";
}
public Molde(String marca,String color, String transmision ){
	this.marca =marca;
	this.color=color;
	this.transmision=transmision;
}

public Molde(String marca,String color){
	this.marca =marca;
	this.color=color;
	
}

//set
public void setColor(String valor) {
	color=valor;
}
public void setMarca(String valor) {
	marca= valor;
	}
public void setTransmision(String valor) {
	transmision= valor;
	}

//get

public String getColor() {
	return color;
}
public String getMarca() {
	return marca;
}
public String getTransmision() {
	return transmision;
}

}
