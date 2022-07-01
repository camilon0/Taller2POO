package Taller2;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


import javax.swing.JOptionPane;
/**
 * Representa una clase main que sirve en la creacion de objetos de las clases del paquete Taller2 y ejecutar funciones.
 * 
 * @author Juan Camilo García García.
 *
 *Version: 2.0.0
 */
public class Main {
	/**
	 * 
	 * @param args definicion de los argumentos que recibe el metodo main
	 * @throws IOException excepcion de entrada y salida
	 */
	public static void main(String[] args) throws IOException {
		/**
		 * Objeto Array de lista de todas las naves
		 */
		List<Shipbuilder> naveList = new ArrayList<>();
		/**
		 * Creador de objetos para cada nave espacial
		 */
		Shipbuilder mainSpaceships[] = new Shipbuilder[4];
		
		mainSpaceships[0] = new FictionShip(12, "Cortana", "USS Enterprise", "Grafeno", "Colombia", 3245521);
		mainSpaceships[1] = new ShuttleShip(1233222, "Comida", "Agamenon", "Carbono", "Estados Unidos", 23000);
		mainSpaceships[2] = new UnmannedShip(231495, "Marte", "Leviathan", "Madera", "Venezuela", 1299);
		mainSpaceships[3] = new MannedShip(7, "Exploracion", "Kratos", "Granito", "Nueva Zelanda", 490900);
			/**
			 * Establecer en Byte el tipo de dato que ingresaremos para el menu
			 */
			byte opcion=0;
			/**
			 * Bucle para la creacion de naves
			 */
			do {
				/**
				 * Menu para la creacion de naves
				 */
				opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
						"Digite el numeral del tipo de nave que desea crear"
						+ "\n1) Nave de Ficcion"
						+ "\n2) Nave Lanzadera"
						+ "\n3) Nave no Tripulada"
						+ "\n4) Nave Tripulada"
						+ "\n5) Finalizar","Creador de naves",JOptionPane.INFORMATION_MESSAGE));
				switch(opcion) {
				/**
				 * Creacion de la nave de ficcion
				 */
				case 1:
					JOptionPane.showMessageDialog(null,"La nave tendra estas caracteristicas:"+"\n"+mainSpaceships[0],"Nave de Ficcion",JOptionPane.INFORMATION_MESSAGE );
					
					if (opcion == 1) {
												
						opcion = Byte.parseByte(JOptionPane.showInputDialog(null,"¿Desea crear mas naves?"+"\n1) Si \n2) No","",JOptionPane.INFORMATION_MESSAGE)); 
						
						if (opcion == 1) {
							naveList.add(mainSpaceships[0]);
							
						}else {
							naveList.add(mainSpaceships[0]); 
							opcion = 5;
						}
						
						}
					
					break;
				/**
				* Creacion de la nave lanzadera
				*/
				case 2:
					JOptionPane.showMessageDialog(null,"La nave tendra estas caracteristicas:"+"\n"+mainSpaceships[1],"Nave Lanzadera",JOptionPane.INFORMATION_MESSAGE );
					if (opcion == 2) {
						
						opcion = Byte.parseByte(JOptionPane.showInputDialog(null,"¿Desea crear mas naves?"+"\n1) Si \n2) No","",JOptionPane.INFORMATION_MESSAGE)); 
						
						if (opcion == 1) {
							naveList.add(mainSpaceships[1]);
							
						}else {
							naveList.add(mainSpaceships[1]); 
							opcion = 5;
						}
						
						}
					break;
				/**
				* Creacion de la nave no tripulada
				*/
				case 3:
					JOptionPane.showMessageDialog(null,"La nave tendra estas caracteristicas:"+"\n"+mainSpaceships[2],"Nave no Tripulada",JOptionPane.INFORMATION_MESSAGE );
					if (opcion == 3) {
						
						opcion = Byte.parseByte(JOptionPane.showInputDialog(null,"¿Desea crear mas naves?"+"\n1) Si \n2) No","",JOptionPane.INFORMATION_MESSAGE)); 

						if (opcion == 1) {
							naveList.add(mainSpaceships[2]);
							
						}else {
							naveList.add(mainSpaceships[2]); 
							opcion = 5;
						}
						
						}
					break;
				/**
				* Creacion de la nave tripulada
				*/
				case 4:
					JOptionPane.showMessageDialog(null,"La nave tendra estas caracteristicas:"+"\n"+mainSpaceships[3],"Nave Tripulada",JOptionPane.INFORMATION_MESSAGE );
					if (opcion == 4) {
						
						opcion = Byte.parseByte(JOptionPane.showInputDialog(null,"¿Desea crear mas naves?"+"\n1) Si \n2) No","",JOptionPane.INFORMATION_MESSAGE)); 
				
						if (opcion == 1) {
							naveList.add(mainSpaceships[3]);
							
						}else {
							naveList.add(mainSpaceships[3]); 
							opcion = 5;
						}
						
						}
					break;
				/**
				 * Opcion para salir del menu
				 */
				case 5:
					opcion=5;
					break;
				/**
				 * mensaje por si el usuario dijita un numero diferente
				 */
				default:
					JOptionPane.showMessageDialog(null,"Opcion no valida, solo entre 1 y 4 o 5 para finalizar:"+"\n"+"","ERROR",JOptionPane.INFORMATION_MESSAGE );
					break;
				}
			/**
			 * mientras la opcion sea diferente del 5 se mantendra en el bucle y creara naves
			 */
			}while(opcion!=5);
			/**
			 * si la opcion en el menu es de 5 almacenara esas naves creadas en la lista de naves
			 */
			if (opcion == 5) {
				/**
				 * Se crea un iterador para imprimir la lista de naves una a una.
				 */
				for(Shipbuilder vehicle: naveList){
		           
		            JOptionPane.showMessageDialog(null,""+vehicle.toString(),"Naves Creadas",JOptionPane.INFORMATION_MESSAGE );
		        }
			}
		}		
}
