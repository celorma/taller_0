package taller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class magicArtOnline {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner (System.in);
		
		File filePlayers = new File ("Jugadores.txt");
		File fileSpells = new File ("Hechizos.txt");
		File filePlayerSpells = new File ("HechizosJugadores.txt");
		File fileEnemy = new File ("Enemigo.txt");
		
		Scanner archPlayers = new Scanner(filePlayers);
		Scanner archSpells = new Scanner(fileSpells);
		Scanner archPlayerSpells = new Scanner(filePlayerSpells);
		Scanner archEnemy = new Scanner(fileEnemy);
		
		int longArray = 100;
		
		String[][] enemyData = new String[][] {{"F","100" ,"75","1" },
							                   {"C","250" ,"50","2" },
							                   {"B","500" ,"25","5" },
							                   {"A","750" ,"10","10"},
							                   {"S","1000","1" ,"20"}};
		
		String[][] players = new String[longArray][8];
		String[][] spells = new String[longArray][2];
		String[][] playerSpells = new String[longArray][2];
		String[][] enemies = new String[longArray][5];

		fillArray(archPlayers, players);
		fillArray(archSpells, spells);
		fillArray(archPlayerSpells, playerSpells);
		fillArray(archEnemy, enemies);
    printArray(players,0);
		
		sc.close();
	}

	
	
	private static void enterListIntoArray(String[] list,String[][] array) //Ingresa una lista a la primera fila de elementos nulos de una matriz
	{
		int i = 0;
		while(array[i][0] != null)
		{
			i++;
		}
		array[i] = list;
	}
	
	private static void printArray(String[][] array, int initialColumn) //Imprime una matriz desde una columna Inicial hasta el m�ximo de columnas de la matriz misma
	{
		for (int i=0;i<array.length;i++)
		{
			System.out.print("[ ");
			for (int j=initialColumn;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("]");
		}
	}

	private static void fillArray(Scanner archive, String[][] array) //Rellena una matriz ya creada con los elementos de un respectivo archivo
	{
		int count = 0;
		while (archive.hasNextLine()) //Si detecta que hay una l�nea en el archivo, sigue leyendo
		{
			String[] parts = archive.nextLine().split(","); //Se crea una lista con los elementos del archivo separado por comas
			array[count] = parts; //Se remplaza la fila de la matriz por la lista "partes" actual
			count++;
		}
	}
  // en teoria le das una palarabra (chekstring) y este te retorna true o false buscando en la matriz true es que esta y false es que no esta la palabra en la matriz
	private static void search (String [][] array, boolean kum,String chekstring) 
	{
		for (int i=0;i<array.length;i++) // este for se supone que recorre la matriz entera 
		{
			for (int j=i;j<array[0].length;j++) {
				if (chekstring == array [i][j] ) {
					kum = true;
					System.out.println(kum);
					}
				}
		}

	}
  
  {
    
  }
}
