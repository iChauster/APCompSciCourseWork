import java.util.ArrayList;
public class ArrayListRunner {
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		System.out.println(names);
		System.out.println("first : " + names.get(0) + " last : " + names.get(names.size() - 1));
		System.out.println("Size : " + names.size());
		names.set(0,"Alice B. Toklas");
		System.out.println(names);
		names.add(4, "Doug");
		System.out.println(names);
		for (String str : names){
			System.out.println(str);
		}
		ArrayList<String> names2 = new ArrayList<String>(names);
		System.out.println(names2);
		names.remove(0);
		System.out.println(names);
		System.out.println(names2);

		//second part

		ArrayList<String> fiveStrings = new ArrayList<String>();
		fiveStrings.add("Ivan");
		fiveStrings.add("Nihal");
		fiveStrings.add("Saud");
		fiveStrings.add("Matt");
		fiveStrings.add("Mihir");
		System.out.println(fiveStrings);
		fiveStrings.remove(fiveStrings.size() - 1);
		fiveStrings.set(1, "Calvin");
		System.out.println(fiveStrings);

	}
}