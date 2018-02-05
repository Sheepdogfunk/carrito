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
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	Molde carrito = new Molde();
		
		carrito.setColor("Narcatico Blue");
		carrito.setMarca("Lotus");
		carrito.setTransmision("Manual");
		
		
		
		//System.out.println("La marca es "+ carrito.marca);
		//System.out.println("El color es "+ carrito.color);
		//System.out.println("La transmision es "+ carrito.transmision);
		
		System.out.println(carrito.getColor());
		System.out.println(carrito.getMarca());
		System.out.println(carrito.getTransmision());
		
		System.out.println("=======================");
		
		Molde carrito1 = new Molde ("Gallardo","BlackMate","Manual"); 
		System.out.println(carrito1.getColor());
		System.out.println(carrito1.getMarca());
		System.out.println(carrito1.getTransmision());
		
		System.out.println("=======================");
		
		Molde carrito2 = new Molde ("Masertrati","SpacePurple");
		carrito2.setTransmision("Manual");
		System.out.println(carrito2.getColor());
		System.out.println(carrito2.getMarca());
		System.out.println(carrito2.getTransmision());
	}

    }
    

