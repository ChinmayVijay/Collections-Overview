# Collections-Overview
A complete overview and simplified explanation for Collection Framework in Java

# 1. What is a Collection ?
Acollection is an object to represent a group of individual objects as a single entity.

# 2. What is Collection Framework? 
Collection framework is the group of all the collection interfaces, classes, implementations and algorithm that are used to represent
a group of individual object as a single entity. 
It was introduced in Java SE 1.2. Prior to that Java initially had few collection classes: Vector, Stack, Hashtable, Properties. 
These classes were also reengineered to accomodate the changes intorduced in Java 1.2 version.

# Some Benefits of Collection Framework:
1. Reduced Development Effort - as classes are available ready to use.
2. Improved Code quality - with the use of well tested collection framework classes
3. Reduced effort for code maintenance.
4. Reusability and Interoperability.

# 3. What were the changes introduced in JDK5 ?
With the introduction of JDK5, some fundamental changes were made to collections framework that significantly increased its power
and streamlined its use.
These changes were:
1. Addition of generics. - this intorduced TYPE SAFETY.
2. Autoboxing and Unboxing. - it facilitated the storing of primitive types in collection.
3. For-each style for loop. - reduced usage of iterator based loops

# 4. What are some Collection related features in Java 8?
Java 8 API brought some changes as follows:
1. Java Stream API for collection classes so as to facilitate sequential as well as parallel processing.
2. Iterator interface was extended with forEach style loop so that we can use it to iterate over collection. It is very
helpful when used with lambda expression as its argument - Consumer is a Functional Interface.
3. Some other improvements like forEachRemaining(Consumer action) method was introduced in Iterator interface, and replaceAll(), compute()
and merge() methods were introduced in Map.

# 5 What are the Key Interfaces of Collection Framework ?
The key interfaces of collection framework are:
1. Collection   2. List   3.Set   4. Sorted Set   5. Navigable Set    6.Queue   7. Map    8. Sorted Map    9. Navigable Map

Collection - It is the root interface of the collection hierarchy. It is used to represent a group of individual object as a single entity.
List - It is an ordered collection. A list can contain duplicate elements and the insertion order is preserved in a List. Index-based retrieval is allowed. List is just like arrays with dynamic length.

Set - It is a collection which does not allow duplicates and the insertion order in set is not preserved. This interface models the mathematical set abstraction used to represent a set.

Map - It is not a child interface of Collection interface unlike all the other Interfaces. It is used to represent key - value pairs.
It cannot contain duplicate values. Each key can map to atmost one value. It is considered as a collection of Entry objects.

# 6. What are modifiable and unmodifiable collections?
Collections allow some methods to be optional. these optional methods allow you to modify the contents of the collection.
Collections that support these methods are called modifiable.
Collections that do not allow their contents to be changed are called unmodifiable.
If an attempt is made to use one of these methods on an unmodifiable collection, it throws UnsupportedOperationException.
Note: All the built-in collections are modifiable.


# 7. Collection Interface : All you need to know:
Syntax: public interface Collection<E> extends Iterable<E>
  1. Root interface in the collection hierarchy.
  2. Represents a group of objects known as its elements.
  3. JDK does not provide any direct implementation of this interface.
  4. Collection extends the Iterable interface this means that forEach style for loop can be used to iterate over the elements.
  5. Exceptions thrown generally : 
      1. UnsupportedOperationException - if a collection cannot be modified.
      2. ClassCastException: if an attempt is made to add an incompatible object.
      3. NullPointerException: when trying to store a null object.
      4. IllegalArgumentException: if an invalid argument is used.
      5. IllegalStatException: when adding an element to an already full, fixed length collection.
  Some Methods decalred in Collection are:
  1. boolean add(Object e)
  2. boolean addAll(Object e)
  3. void clear()
  4. boolean contains(Object o)
  5. boolean containsAll(Collection<?> o)
  6. boolean equals(Object o)
  7. int hascode()
  8. boolean isEmpty()
  9. Iterator<E> iterator()
 10. default Stream<E> parallelStream()
 11. boolean remove(Object O)
 12. boolean removeAll(Object o)
 13. default boolean removeIf(new Predicate<?super E> predicate)
 14. boolean retainAll(Collection<E> c)
 15. int size()
 16. default Spliterator<E> spliterator()
 17. default Stream<E> stream()
 18. Object[] toArray()
 19. <T> T[] toArray(T array[])
  
  


