package com.kh.threadMain;

import java.io.IOException;
import java.util.Random;
 
public class SimpleGame {   
	private static boolean isGameOver = false;
   
	public static void main(String[] args) {
		// ï¿½Üºï¿½ Å¬ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Î½ï¿½ï¿½Ï½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
		SimpleGame s = new SimpleGame();
		
		// ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
		Thread gameThread = new Thread(s.new Gm());
		gameThread.start();
		
		// ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ : ï¿½Ã·ï¿½ï¿½Ì¾î°¡ Enter Å°ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
		try {
			System.in.read(); // ï¿½ï¿½ï¿½ï¿½Ú°ï¿½ Å°ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½Æ®ï¿½ï¿½ ï¿½Ð°ï¿½, ï¿½ï¿½ï¿½ï¿½Ú°ï¿½ Enter Å°ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Î±×·ï¿½ ï¿½Ï½ï¿½ ï¿½ï¿½ï¿½ï¿½
			
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	class Gm implements Runnable{
		@Override
		public void run() {
			while (!isGameOver) {
				// ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
				int randomValue = new Random().nextInt(10);
				System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ : " + randomValue);
				
				// ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½Ã°ï¿½
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ Enter Å°ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½
				System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½Ï·ï¿½ï¿½ï¿½ Enterï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½");
			}
		}
	}
	
	class GameLoop implements Runnable{

		
		@Override
		public void run() {
			while(!isGameOver) {
				// ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
				int randomValue = new Random().nextInt(10); // ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
				System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ : " + randomValue);
				
<<<<<<< HEAD
				// °ÔÀÓ ·çÇÁ Áö¿¬ ½Ã°£
=======
				// ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½Ã°ï¿½
>>>>>>> a0f8e25d230d0dee9fff086470109503bef029cf
				try {
					Thread.sleep(1000); // 1ï¿½ï¿½ ï¿½ï¿½ï¿½
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½");
			}
		}
	}
}
