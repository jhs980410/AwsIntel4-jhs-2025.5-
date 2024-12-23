package three15;

public class CaptionTv extends Tv{

	boolean caqtion = false;
	
	// 자막 //  
	void displayCaption(String text) {
		if (caqtion == true) {
			System.err.println(text);
		}
		
	
	}
}
