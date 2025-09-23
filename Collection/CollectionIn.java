// Collection in Java
// This program demonstrates the use of Java Collections by creating a list, adding elements to it, and iterating through the elements.

package Collection;

// boolean add(Object o) : adds the specified element to the collection
// boolean addAll(Collection c) : adds all of the elements in the specified collection to this collection
// void clear() : removes all of the elements from the collection
// boolean remove(Object o) : removes a single instance of the specified element from the collection, if it is present
// boolean removeAll(Collection c) : removes all of this collection's elements that are also contained in the specified collection
// boolean isEmpty() : returns true if the collection contains no elements
// int size() : returns the number of elements in the collection
// iterator<E> iterator() : returns an iterator over the elements in the collection
// boolean contains(Object o) : returns true if the collection contains the specified element

import java.util.Collection;

public class CollectionIn{
    public static void main(String[] args){
        Collection<String> collection = new java.util.ArrayList<>();

        // Adding elements to the collection
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        // Displaying the size of the collection
        System.out.println("Size of collection: " + collection.size());

        // Checking if the collection contains a specific element
        System.out.println("Collection contains 'Banana': " + collection.contains("Banana"));

        // Iterating through the elements in the collection
        System.out.println("Elements in the collection:");
        for (String item : collection) {
            System.out.println(item);
        }

        // Removing an element from the collection
        collection.remove("Banana");
        System.out.println("After removing 'Banana', size of collection: " + collection.size());

        // Clearing the collection
        collection.clear();
        System.out.println("After clearing, is the collection empty? " + collection.isEmpty());
    }

}
