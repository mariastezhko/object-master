package com.codingdojo.objectmaster;

public class Ninja extends Human {
	Integer health = 10;
	
	public void steal(Human h) {
		h.health -= stealth;
		health += stealth;
	}
	
	public void runAway() {
		health -= 10;
	}
}
