package hk.exam.seven;

public class ArenaRule {

	// 2장의 카드 합산 결과를 돌려준다
	public static int getCardToJumsu(Card[] cardArr) {
	    int scoreSum = 0;

	    for (Card card : cardArr) {
	    	//카드에서 문자열 하나하나 가져옴 , ex: ◆6
	        String cardStr = card.getCard();
	        // 카드 문자열 삽입 
	        String cardNumber = cardStr.substring(1); // 카드의 숫자 부분만 추출
	        // 카드 0다음 1번 문자열추출후 삽입 / 
	        
	        // 숫자에 따라 점수 부여
	        switch (cardNumber) {
	            case "A":
	                scoreSum += 1;
	                break;
	            case "T":
	                scoreSum += 10;
	                break;
	            case "J":
	                scoreSum += 11;
	                break;
	            case "Q":
	                scoreSum += 12;
	                break;
	            case "K":
	                scoreSum += 13;
	                break;
	                // 숫자 카드의 경우 그 숫자만큼 점수 부여
	            case "2" :
	            case "3" :
	            case "4" :
	            case "5" :
	            case "6" :
	            case "7" :
	            case "8" :
	            case "9" :
	            	scoreSum += Integer.parseInt(cardNumber);
	            	//문자열 "2" 를 정수타입으로 변경 
	                break;
	        }
	        
	      
	    }

	    return scoreSum;
	}

	// 2사람의 카드 결과를 평가한다.
	/**
	 * 
	 * @param my
	 * @param you 점수가 높은 플레이어가 승리
	 */
	public static void setGamePlayAssess(Player my, Player you) {
		if (my.getScore() > you.getScore()) {
			my.setWinner(true);
			you.setWinner(false);
		} else {
			you.setWinner(true);
			my.setWinner(false);
		}
	}

	// 게임 결과 보여주기
	public static void gamePlayResultInfo(Player my, Player you) {
		System.out.println("게임의 승자는! ");
		Card[] myCardArr = my.getMyChoiceCards();
		Card[] yourCardArr = you.getMyChoiceCards();

		StringBuffer mySb = new StringBuffer();
		StringBuffer yourSb = new StringBuffer();

		for (int i = 0; i < yourCardArr.length; i++) {
			mySb.append("<" + (i + 1) + "번째 카드> ");
			mySb.append(myCardArr[i].getClass() + " ");

			yourSb.append("<" + (i + 1) + "번째 카드> ");
			yourSb.append(yourCardArr[i].getClass() + " ");
		}

		System.out.print(my.getName() + ": " + mySb.toString() + "= " + my.getScore() + " vs ");
		System.out.println(you.getName() + ": " + yourSb.toString() + "= " + you.getScore());

		if (my.isWinner()) {
			System.out.println(my.getName() + "님 입니다.");
		} else {
			System.out.println(you.getName() + "님 입니다.");
		}
	}

}
