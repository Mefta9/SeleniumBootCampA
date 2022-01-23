package PnTBootCamp.SeleniumBootCampA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("Rush Hour"); //String form
		movies.add("Sprider Man");
		movies.add("Titanic");
		
		
		for (int i=0; i<movies.size(); i++) //i is a variable
			System.out.println(movies.get(i)); // get (int index)
		
	ListIterator<String> ilmovies = movies.listIterator(movies.size());	// Import ListIterator (java.uti)
		while (ilmovies.hasPrevious()){
			String favmovies = ilmovies.previous();
			System.out.println(favmovies);
		}
		
		
		
		/*for (String favmovies: movies) {
			System.out.println(favmovies);
		}
		
		Iterator<String> ilmovies = movies.iterator(); //ilmovies = name of iterator
		ilmovies.forEachRemaining(favmovies -> {	   // favmovies= name of the movies
			System.out.println(favmovies);
		});
		
				
		Iterator<String> ilmovies = movies.iterator(); // import from java.uti
		while(ilmovies.hasNext()) {     // if this iteratot available, it'll go to next
			String favmovies = ilmovies.next(); //go to next if the value if available.
			System.out.println(favmovies);
		}
		
		movies.forEach(favmovies ->{
			System.out.println(favmovies);  // favmovies will show the movies.
		});*/
		
		
	}

}
