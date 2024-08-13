package com.practice;

public class PlayerData {
	public static void main(String[] args) {
		Child child = new Child(0, null, null);
		Driverr driverr = new Driverr();
		System.out.println(driverr.getPlayer(45).name);
	}
}

class Player{
	int id;
	String name;
	
	Player(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Driverr{
	
	Player[] players = {
			new Player(7, "Dhoni"),
			new Player(18, "Kohli"),
			new Player(45, "Sharma")
	};
 	
	
	Player getPlayer(int id) {
		for(Player playe: players) {
			if(playe.id == id) {
				return playe;
			}
		}
		return null;
	}
	
}



