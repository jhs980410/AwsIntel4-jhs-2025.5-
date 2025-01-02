package hk.exam.seven;

public class Player {

	private String name = ""; // 이름
	private int age = 0;		// 나이
	private int score = 0;		// 2개의 카드를 더한 점수
	private boolean winner = false; // 승자가 누구인지 기록 (true 승자, false 패자)
	private Card[] myChoiceCards = null; // 내가 선택한 2장의 카드
	

	// 생성자 (멤버변수 초기화)
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.myChoiceCards = new Card[2];
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Card[] getMyChoiceCards() {
		return myChoiceCards;
	}

	public void setMyChoiceCards(Card[] myChoiceCards) {
		this.myChoiceCards = myChoiceCards;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	
	// 게임에 이용할 카드를 뽑는다
	public Card[] drawCard() {
		
		for (int i = 0; i < myChoiceCards.length; i++) {
			this.myChoiceCards[i] = new Card();
			
		}
		
		return myChoiceCards;
		
		
		
	}

	// 카드 섞기
	public void shuffle() {
		
		CardCase cardCase = new CardCase();
		cardCase.init();
		
	}

}
