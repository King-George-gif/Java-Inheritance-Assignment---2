package answer;

class Author{
	private String name, email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String toString() {
		return this.name + "("+ this.gender+") at "+ this.email;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	Book(String name, Author author, double price, int qty){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "'"+this.name + "' by " + this.getAuthor().getName() + " ("+ this.getAuthor().getGender()+ ") at " + this.getAuthor().getEmail();
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
