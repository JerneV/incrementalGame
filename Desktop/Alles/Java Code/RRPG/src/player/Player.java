package player;

public class Player {
	
		//Declaring some variables I'll probably use
	
		//Player Name, not sure if I'll even use this
		String name;
		//Strength of player
		double power;
		//Health
		double health = 100.0;
		//Not sure, but if the rpg gets out of hand I'll use this -> MAYBE FOR HEALING
		double mana = 150.0;
		
		//Setter for name, so we can easily change it later 
		public void setName(String n){
			name = n;
		}
		//Getter for name, so we can easily get the name later if we need it
		public String getName(){
			return name;
		}
		//Setter for the powerlvl, should come in handy when player gets new weapon
		public void setPower (double p){
			power = p;
		}
		//Getter for powerlvl, for when we need to kill some monsters
		public double getPower(){
			return power;
		}

		public void setHealth(double h){
			health = h;
		}

		public double getHealth(){
			return health;
		}

		public void setMana(double m){
			mana = m;
		}

		
		public double getMana(){
			return mana;
		}
		
		public void heal(){ //Using mana to heal..
			
			
		}
}

	//Inventory Shizzle, te moe om het af te maken
	//https://www.youtube.com/watch?v=xIPLpGOjZqQ

