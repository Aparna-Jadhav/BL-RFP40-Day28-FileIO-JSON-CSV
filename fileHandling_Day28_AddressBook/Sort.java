package fileHandling_Day28_AddressBook;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort 
{
	public static void sortByZip(ArrayList<Person> person)
	{
		Collections.sort(person, Person.zipCodeSorting);
		for(Person p: person)
		{
			System.out.println(p);
		}
	}
	
	public static void sortByName(ArrayList<Person> person)
	{
		Collections.sort(person, Person.firstNameSorting);
		for(Person p: person)
		{
			System.out.println(p);
		}
	}

	
}
