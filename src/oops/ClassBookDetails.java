package oops;

public class ClassBookDetails {

	static void showBookDetails(ClassBook clsBook) {
		System.out.println(clsBook.getBookTitle());
		System.out.println(clsBook.getAuthotName());
		System.out.println(clsBook.getBookPrice());
		System.out.println(clsBook.getPublishedYear());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassBook cb = new ClassBook();
		cb.setBookTitle("The Art Of Being Alone");
		cb.setAuthotName("Manikanta");
		cb.setBookPrice(2000);
		cb.setPublishedYear(2023);
		
	}

}
