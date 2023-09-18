package com.kh.comparablePractice;

import java.util.ArrayList;
import java.util.List;

public class ActorMain {

	public static void main(String[] args) {
		List<Actor> actors = new ArrayList<>();
		actors.add(new Actor ("°­µ¿¿ø", 40));
		actors.add(new Actor ("±è¿ìºó", 30));
		actors.add(new Actor ("ÃÖ¿ì½Ä", 30));
		
		for(Actor actor : actors) {
			System.out.println(actor);
		}
	}

}
