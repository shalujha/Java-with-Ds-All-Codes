import javax.swing.JButton;
import javax.swing.JFrame;


public class tictactoe extends JFrame {
	//public static int BOARD_SIZE=3;
//	public static enum GameStatus{   // enum is used when we want to club all the variables together
	//	Xwins,Zwins,Tie,Incomplete;
//	}
//	private JButton[][] buttons=new JButton[BOARD_SIZE][BOARD_SIZE]; // jbutton is also an inbuilt  class in java which is used to implement the functionality of button 
	
	public tictactoe()
	{
		super.setTitle("TicTacToe"); // it will set the title for that frame
		super.setSize(800, 800);  // it is used to set the dimensions of layout/frame. ist parameter is width and second is height . both are in pixels.
		super.setVisible(true); // it will make these things visible on your screen/desktop
		// if i will comment this setvisible function , the application will run but it will terminate on its own without displaying our frame
	}

	
}
