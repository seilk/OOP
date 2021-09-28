import java.util.Scanner;

// Do not change class 'Main' code.
public class HW4_01 {

	public static void main(String[] args) {

		Person41 p1 = new Person41();
		p1.readInput();

		String p1Name = p1.getName();
		int p1Age = p1.getAge();
		int p1MonthBirth = p1.getMonthBirth();
		String p1MonthBirthName = p1.getMonthName();

		System.out.println(p1Name + " " + p1Age + " " + p1MonthBirth + " " + p1MonthBirthName);
		System.out.println(p1.info());

	}

}

class Person41 {
	String name;
	int age;
	int monthBirth;
	String str;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMonthBirth() {
		return monthBirth;
	}

	public String getMonthName() {
		if (monthBirth == 1)
			str = "JAN";

		if (monthBirth == 2)
			str = "FEB";

		if (monthBirth == 3)
			str = "MAR";

		if (monthBirth == 4)
			str = "APR";

		if (monthBirth == 5)
			str = "MAY";

		if (monthBirth == 6)
			str = "JUN";

		if (monthBirth == 7)
			str = "JUL";

		if (monthBirth == 8)
			str = "AUG";

		if (monthBirth == 9)
			str = "SEP";

		if (monthBirth == 10)
			str = "OCT";

		if (monthBirth == 11)
			str = "NOV";

		if (monthBirth == 12)
			str = "DEC";

		return str;
	}

	public void readInput() {
		Scanner kb = new Scanner(System.in);
		this.name = kb.next();
		this.age = kb.nextInt();
		this.monthBirth = kb.nextInt();
		kb.close();
	}

	public String info() {
		String output = "[PERSON] " + "name" + "(" + name + ") " + "age" + "(" + age + ") " + "month" + "(" + str + ")";
		return output;
	}
}