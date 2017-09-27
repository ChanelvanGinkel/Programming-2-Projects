
public class HalfSizePicture {
	
	public static void main(String []args) {
		
		Picture p = new Picture();
		p.load("/Users/9618856/Desktop/Programming 2/Chapter2/src/81.jpg");
		int w = p.getWidth();
		int h = p.getHeight();
		p.scale(w/2, h/2);
		p.move(w/4, h/4);
	}

}
