/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuhocbuoi6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Nhat Hoang
 */
/*
1. forEach() và biểu thức lambda
2.iterator()
3.iterator và forEachRemained()
4.ListIterator()
5. Vòng lặp for-each
6.Vòng lặp với chỉ số
*/
public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breakin Bad");
        tvShows.add("Game of thrones");
        tvShows.add("Friends");
        tvShows.add("prison break");
        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        tvShows.forEach(tvShow ->{
            System.out.println(tvShows);
        });
        System.out.println("\n=== interate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while(tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using a Listinterator() to traverse in both driections==");
        // Here, we start from  the end of the list and traverse backwards.
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while(tvShowListIterator.hasPrevious()){
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using simple for each loop===");
        tvShows.forEach((_item) -> {
            System.out.println(tvShows);
        });
        System.out.println("\n=== Iterator using for loop with index===");
        for (int i = 0; i < tvShows.size(); i++) {
        System.out.println(tvShows.get(i));
    }
    }
}
