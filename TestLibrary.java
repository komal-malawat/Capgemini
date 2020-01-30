import com.cg.lib.Book;
import com.cg.lib.Student;

public class TestLibrary {

	public static void main(String[] args) {
		 Student s = new Student("Polo");
		 Book b = new Book("5 points someone");

		 b.status(s);
	}

}
