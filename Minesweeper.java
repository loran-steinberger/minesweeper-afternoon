import java.util.Scanner;

public class Minesweeper {

	private final Scanner reader = new Scanner(System.in);

	public Minesweeper() {
		game = new Game(Game.Level.EASY);
		io(game);
	}

	public static void main(String[] args) {
		new Minesweeper().io();
	}

	private void io(Game game) {
		do {
			System.out.println(game.toString());
			int x = reader.nextInt();
			int y = reader.nextInt();
			game.click(x, y);
		}
		while(game.getState() == State.PLAY);
		exit();
	}

	private void exit() {
		if(game.getState() == State.WIN) System.out.println("You've won the game!");
		else System.out.println("You've lost the game...");
		System.out.println(game.toString());
		System.exit(0);
	}
}
