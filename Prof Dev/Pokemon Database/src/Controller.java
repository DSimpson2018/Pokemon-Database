import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		final PokemonDAO pokemonList = new PokemonDAO();
		ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();
		
		Scanner input = new Scanner(System.in);
		
		int choice;
		
		do {
			//basic CRUD menu
			System.out.println("---------------------------");
			System.out.println("Pokemon Database Menu");
			System.out.println("Choose from these options");
			System.out.println("---------------------------");
			System.out.println("1 - Retrieve all Pokeomn");
			System.out.println("2 - Search for a Pokemon");
			System.out.println("3 - Delete Pokemon");
			System.out.println("4 - Insert Pokemon into database");
			System.out.println("5 - Update Pokemon details");
			System.out.println("6 - Exit");
			System.out.println("Please enter your choice - ");
			
			choice = input.nextInt();
		}
		
		while(choice < 7);
			
		switch(choice) {
		case 1: //get all Pokemon
			allPokemon = pokemonList.allPokemon();
				for(Pokemon p : allPokemon)
				{
					System.out.println(p);
				}
				break;
			
		case 2: //get Pokemon by ID
			int idP;
			System.out.println("Pokemon ID: ");
			idP = input.nextInt();
			Pokemon getidP = pokemonList.getPID(getidP);
			System.out.println(getidP);
			break;
			
		case 3:
			
		case 4:
			
		case 5:
			
		case 6:
			
		default:	
		}

	}
	input.close();
}
