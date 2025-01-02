package hk.exam.one;

public class DiceService {
	
	// 주사위를 던지다.
	int  diceNum = 0;
	public void throwDice(){
		diceNum = (int)(Math.random()*6)+1;
		System.out.println("주사위를 던졌습니다.");
		System.out.print("주사위값: ");
		System.out.println(diceNum);
	}
}
