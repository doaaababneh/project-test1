package project1;

import java.util.ArrayList;

public class Sarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\webdriver\\\\chrome\\\\chromedriver.exe");
		
		String [] food = new String[7];
				food[0]="mansafe";
				food[1]="pizaa";
				food[2]="burger";
				food[3]="pasta";
				food[4]="salads";
				food[5]="meat";
				food[6]="fish";
				System.out.println(food[0]);
				
				
				
				String [] foods= {"mansafe","pizaa","pasta","salads","meat","fish","burger"};
				System.out.println(foods[3]);
				
				ArrayList<String>foood=new ArrayList<String>();
				foood.add("mansafe");
				foood.add("pizaa");
				foood.add("burger");
				foood.add("pasta");
				foood.add("salads");
				foood.add("meat");
				foood.add("fish");
				
				System.out.println(foood.lastIndexOf("fish")+"this is lovely fooooood");
			
		
		
	}

}
