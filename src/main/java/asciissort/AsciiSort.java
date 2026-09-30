package asciissort;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class AsciiSort {
    public int getComplexity(String book){
        int total = 0;
        char[] characters = new char[book.length()];
        book.getChars(0, book.length(), characters, 0);

        for (char character : characters){
            total += character;

        }
        return total;
    }

    public ArrayList<String> sortByAscii(String[] books){
        SortedMap<Integer, String> sortTable = new TreeMap<>();

        for (String book : books){
            sortTable.put(this.getComplexity(book), book);
        }
        ArrayList<String> output = new ArrayList<>();
        sortTable.forEach((  comp, book ) -> {
            output.add(book);
            System.out.println(book + " has complexity of " + comp);
        });
        return output;
    }

    static void main() {
        AsciiSort runner = new AsciiSort();
        System.out.println(runner.sortByAscii(new String[]{
                "The Catcher in the Rye", "To Kill a Mockingbird", "1984", "Moby Dick"
        }));
    }
}
