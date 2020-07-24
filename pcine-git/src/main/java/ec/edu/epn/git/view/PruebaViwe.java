package ec.edu.epn.git.view;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import ec.edu.epn.git.control.ControlFunciones;
import ec.edu.epn.git.control.ControlPeliculas;
import ec.edu.epn.git.dao.FuncionDAO;
import ec.edu.epn.git.dao.PeliculaDAO;
import ec.edu.epn.git.dto.FuncionDTO;
import ec.edu.epn.git.dto.PeliculaDTO;
import ec.edu.epn.git.dto.SalaDTO;

public class PruebaViwe {	
	
	public static void main(String[] args) throws ParseException {
	// TODO Auto-generated method stub
	PeliculaDAO cPelicula = new ControlPeliculas();
	//Creamos un control de funciones en el cual agregaremos nuestras funciones
	
	FuncionDAO cFuncion = new ControlFunciones();
	
	
	/*Creacion de listado de peliculas*/
	PeliculaDTO pelicula1 = new PeliculaDTO(0,"Sonic","Comedia",2020,120);
	PeliculaDTO pelicula2 = new PeliculaDTO(1,"Mortal Kombat","Accion",2020,90);
	PeliculaDTO pelicula3 = new PeliculaDTO(2,"Presencia Maligna","Terror",2020,100);
	
	SalaDTO sala1 = new SalaDTO(0, 8, 21);
	SalaDTO sala2 = new SalaDTO(1, 8, 19);
	SalaDTO sala3 = new SalaDTO(2, 7, 16);
	
	FuncionDTO funcion1 = new FuncionDTO(0, "2D", "12-08-2020", "13H00", pelicula1, sala1);
	FuncionDTO funcion2 = new FuncionDTO(1, "3D", "12-08-2020", "16H00", pelicula1, sala2);
	FuncionDTO funcion3 = new FuncionDTO(2, "2D", "12-08-2020", "19H00", pelicula1, sala1);
	
	FuncionDTO funcion4 = new FuncionDTO(3, "3D", "13-08-2020", "15H00", pelicula2, sala3);
	FuncionDTO funcion5 = new FuncionDTO(4, "2D", "13-08-2020", "17H00", pelicula2, sala3);
	
	FuncionDTO funcion6 = new FuncionDTO(5, "3D", "14-08-2020", "10H00", pelicula3, sala3);
	FuncionDTO funcion7 = new FuncionDTO(6, "2D", "14-08-2020", "12H30", pelicula3, sala2);
	
	cPelicula.addPelicula(pelicula1);
	cPelicula.addPelicula(pelicula2);
	cPelicula.addPelicula(pelicula3);
	
	/*Creacion de las funciones*/
	cFuncion.addFuncion(funcion1);
	cFuncion.addFuncion(funcion2);
	cFuncion.addFuncion(funcion3);
	cFuncion.addFuncion(funcion4);
	cFuncion.addFuncion(funcion5);
	cFuncion.addFuncion(funcion6);
	cFuncion.addFuncion(funcion7);
	
	
	System.out.println("**CINE - VENTA BOLETOS**");
	imprimirPeliculas(cPelicula.findAllPeliculas());
	Scanner entradaSelPelicula = new Scanner(System.in);
	int seleccionPel=0;
	while(true) {
		System.out.println("Ingrese el numero de la pelicula que desea ver: ");
		try {
			seleccionPel = Integer.parseInt(entradaSelPelicula.nextLine())-1;
			break;
		} catch (NumberFormatException e) {
			System.out.println("Porfavor ingresar un codigo existente.");
		}
	}
	
	
	imprimirFunciones(cFuncion.findAllFuncionesByIdPelicula(seleccionPel));
	
	Scanner entradaSelFunc = new Scanner(System.in);
	int seleccionFun=0;
	while(true) {
		System.out.println("Ingrese el numero de la Funcion que desea ver: ");
		try {
			seleccionFun = Integer.parseInt(entradaSelFunc.nextLine())-1;
			break;
		} catch (NumberFormatException e) {
			System.out.println("Porfavor ingresar un codigo existente.");
		}
	}
	System.out.println("Ingrese el codigo de el asiento deseado");
	
	
	

}
	public static void imprimirPeliculas(ArrayList<PeliculaDTO> cPelicula ) {
		System.out.println("\n**Listado peliculas disponibles**\n");
		for (PeliculaDTO pel : cPelicula) {
			System.out.println(pel);
		}
	}
	
	public static void imprimirFunciones(ArrayList<FuncionDTO> cFunciones) {
		System.out.println("\n**Listado Funciones para la pelicula **");
		for (FuncionDTO fun : cFunciones) {
			System.out.println(fun);
		}
	}
	
	public static void imprimirAsientos(int[][] asientos) {
		String aux[][] = new String[asientos.length+1][asientos[0].length+1];
		String aux2="";
		System.out.println();
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				//if() {}
			}
		}
	}



}

/*
 * Peliculas creadas
 * Con un scan selecccionar la pelicula que queremos
 * Luego amostar las funciones de esa pelicula **
 * Seleccionar la funcion**
 * Seleccionar el asiento
 * Pagar
 * Facturar los boletos que querramos
 * Mostrar los boletos
 * */

/*   1  2  3  4  5  
 * A -  X  -  -  -
 * B -  X  -  -  -
 * C -  X  -  -  -
 * D -  X  -  -  -
 * E -  X  -  -  -
 * */
 