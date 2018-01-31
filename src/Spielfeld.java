
public class Spielfeld {
	public int[] hintergrund_Farbe = {0,0,0};
	public int[] farbe_Punkte = {255,255,255};
	public int[] farbe_Waende = {24,30,182};
	//0 = leeres Feld
	//1 = Wand
	//2 = Punkt
	//3 = Hurensohnfeld 
	protected int[][] playGround = {

			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,1,2,1,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,2,1,2,1,2,1,1,2,1,2,1,1,1,1,2,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,2,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,2,1},
			       {1,2,1,2,1,1,2,1,2,1,2,2,2,2,2,2,2,2,2,1,1,2,1,2,2,2,2,2,2,2,1},
			       {1,1,1,2,2,2,2,1,2,2,2,2,1,1,3,3,1,1,2,2,2,2,1,2,1,1,1,2,1,2,1},
			       {1,2,1,2,1,1,2,1,2,1,1,2,1,2,2,2,2,1,2,1,1,2,1,2,2,2,1,2,1,2,1},
			       {1,2,1,2,2,2,2,1,2,1,1,2,1,1,1,1,1,1,2,1,1,2,1,2,2,2,2,2,2,2,1},
			       {1,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,1},
			       {1,2,2,2,2,2,2,2,1,2,1,1,1,1,1,1,2,2,2,2,2,2,2,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,1,1,2,2,2,2,2,1,1,2,1,1,1,1,1,2,2,2,1,2,2,2,2,1},
			       {1,2,2,2,2,2,2,2,2,2,1,1,1,2,1,1,2,1,1,1,1,1,2,1,2,1,2,1,1,1,1},
			       {1,2,1,1,2,1,2,1,1,2,2,2,1,2,2,2,2,1,1,2,2,2,2,1,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,2,1,1,1,2,2,2,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,1,1,2,1,1,1,2,2,2,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

			    //**   {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {1,2,1,0,0,0,2,1,2,0,2,1,2,1,1,2,2,0,1,1,2,1,0,0,0,2,1,2,1},
			       {1,2,1,0,0,0,2,0,1,0,1,0,2,1,0,1,2,1,0,1,2,1,0,0,0,2,1,2,1},
			       {1,2,1,0,1,1,2,0,0,1,0,0,2,1,0,0,1,0,0,1,2,1,1,1,1,2,1,2,1},
			       {1,2,1,0,0,1,2,2,2,1,0,0,2,1,2,2,2,2,2,1,2,1,2,2,2,2,1,2,1},
			       {1,2,1,1,1,1,2,0,0,1,0,0,2,1,2,0,0,0,2,1,2,1,1,1,1,2,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,2,1,2,0,2,1,2,1,0,2,0,0,0,1,2,1,1,1,1,2,1,2,1},
			       {1,2,1,0,0,0,2,1,2,0,2,1,2,1,1,2,2,0,1,1,2,1,0,0,0,2,1,2,1},
			       {1,2,1,0,0,0,2,0,1,0,1,0,2,1,0,1,2,1,0,1,2,1,0,0,0,2,1,2,1},
			       {1,2,1,0,1,1,2,0,0,1,0,0,2,1,0,0,1,0,0,1,2,1,1,1,1,2,1,2,1},
			       {1,2,1,0,0,1,2,2,2,1,0,0,2,1,2,2,2,2,2,1,2,1,2,2,2,2,1,2,1},
			       {1,2,1,1,1,1,2,0,0,1,0,0,2,1,2,0,0,0,2,1,2,1,1,1,1,2,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}**//

			}; 
	
	public int[] getHintergrundfarbe() {
		return hintergrund_Farbe;
	}
	public int[] getfarbe_Punkte() {
		return farbe_Punkte;
	}
	public int[] getfarbe_Waende() {
		return farbe_Waende;
	}
}
//27breit*20hoch