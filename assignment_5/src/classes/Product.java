package classes;

import java.util.ArrayList;

import exceptions.InvalidInputValueForArray;
import exceptions.InvalidInputValueForWeek;

/*
 * 
 * DISCLAIMER
 * Most of the given methods are implemented with bugs
 * Cele mai multe dintre metodele date au bug-uri 
 * 
 * 
 * SPECS
 * 
 * name - between 5 and 200 alpha-numeric chars (no special chars)
 * price - between [0.01, 100000)
 * soldItems - between [0, 1000]
 * 
 * 
 */

public class Product {
	private String name;
	private float price;
	private ArrayList<Integer> weeklySoldItems;		//number of items sold each week
	
	public Product(String name, float price) {
		this.name = name;
		this.price = price;
		this.weeklySoldItems = new ArrayList<Integer>();
	}

	public Product(String name, float price, ArrayList<Integer> soldItems) {
		this.name = name;
		this.price = price;
		this.weeklySoldItems = new ArrayList<Integer>();
		if(soldItems != null) {
			for(Integer n: soldItems) {
				this.weeklySoldItems.add(n);
			}
		} else
			throw new InvalidInputValueForArray();
	}
	
	public void setSales(ArrayList<Integer> soldItems) {
		if(soldItems != null) {
			this.weeklySoldItems = soldItems;
		} else 
			throw new InvalidInputValueForArray();
	}

	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void addWeek(int soldItems) {
		if(soldItems >= 0) {
			weeklySoldItems.add(soldItems);
		} else
			throw new InvalidInputValueForWeek();
	}
	
	public int getSoldItems(int i) {
		return weeklySoldItems.get(i);
	}
	
	/*
	 * 
	 * determines the number of weeks with sales above the given limit
	 * determina numarul de saptamani in care au fost vandute un numar de produse peste limita data
	 * 
	 */
	public int getNoWeeksAboveLimit(int minLimit){
		int noWeeks = 0;
		for(int n: weeklySoldItems) {
			if(n > minLimit)
				noWeeks++;
		}
		return noWeeks;
	}
	
	/*
	 * 
	 * determines the percentage (%) of weeks with sales under the given limit from total number of weeks
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari sub limita data
	 * 
	 */
	public int getPercentOfBadWeeks(int minLimit){
		float m = 0;
		for(Integer n: weeklySoldItems)
			if(n < minLimit)
				m++;
		
		return (int) (100 * m / this.weeklySoldItems.size());
	}
	
	/*
	 * 
	 * 
	 * determines the index of the weeks with maximum sales (multiple weeks can have maximum sales)
	 * determina indexul saptamanilor cu vanzari maxime (mai multe saptamani pot avea vanzari la nivel maxim)
	 * 
	 * 
	 */
	
	public ArrayList<Integer> getWeeksIndexWithMaxSales(){
		ArrayList<Integer> maxWeeks = new ArrayList<>();
		int max = this.weeklySoldItems.get(0);
		
		for(int i = 0; i < this.weeklySoldItems.size(); i++) {
			if(this.weeklySoldItems.get(i) > max)
				max = this.weeklySoldItems.get(i);
		}
		for(int i = 0; i < this.weeklySoldItems.size(); i++) {
			if(this.weeklySoldItems.get(i) == max)
				maxWeeks.add(i);
		}
		return maxWeeks;
	}
	
	@Override
	public String toString() {
		String output = this.name + " weekly sales: ";
		for(Integer n: weeklySoldItems)
			output += n + " ";
		return output;
	}	
}

