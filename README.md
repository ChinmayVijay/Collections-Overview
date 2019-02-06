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
  
  ## Some Methods decalred in Collection are:
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

# 8. List Interface : All you need to know:
syntax: public interface List<E> extends Collection<E>
  1. It is the child interface of Collection.
  2. It is an ordered collection that stores a sequence of elements.
  3. Elements can be inserted or searched by their position in the list using a zero-based index.
  4. Duplicate elements are allowed. Typically it allows elements such that e1.equals(e2).
  5. Insertion order is preserved.
  6. It provides a special iterator called ListIterator, that allows insertion and replacement and bidirectional access.
  7. Some general exception :
      1. UnsupportedOperationException - if a collection cannot be modified.
      2. ClassCastException: if an attempt is made to add an incompatible object.
      3. NullPointerException: when trying to store a null object.
      4. IllegalArgumentException: if an invalid argument is used.
      5. IndexOutOfBoundsException: if an invalid index is used.
## Methods declared are:
  1. void add(int index, Object o)
  2. boolean addAll(int index, Collection<E> c)
  3. E get(int index)
  4. int indexOf(object obj)
  5. int lastIndexOf(Object obj)
  6. ListIterator<E> listIterator();
  7. ListIterator<E> listIterator(int index)
  8. E remove(int index)
  9. default void replaceAll(UnaryOperator<E> opToApply)
  10. E set(int index, E object)
  11. default void sort(Comparator< ? super E> comp)
  12. List<E> subList(int start, int end)
  
  # 9. Set Interface : All you need to know:
  syntax: public interface Set<E> extends Collection<E>
  1. It is the child interfacce of Collection interface.
  2. It does not allow duplicate elements. i.e., the lements that satisy e1.equals(e2)
  3. This interface models the mathematical set abstraction.
  4. Insertion order is not preserved.
  5. Some general exceptions are:
      1. NoSuchElementException - when no items are contained in the invoking set.
      2. ClassCastException: if an attempt is made to add an incompatible object.
      3. NullPointerException: when trying to store a null object.
      4. IllegalArgumentException: if an invalid argument is used.
  6. No additional methods were added in Set interface.
  
  # 10. SortedSet interface: All you need to know:
  Syntax: public interface SortedSet<E> extends Set<E>
  1. It is the child interface of Set interface.
  2. It does not allow any duplicates.
  3. Elements are inserted based on some sorting order.
  4. default sorting order is ascending order. Customized sorting order can be provided using an implementation of Comparator<E> interface.
  5. All elements inserted into the SortedSet must implement the Comparable Interface. As all elements must be mutually comparable.
  6. This interface is the Set analogue of SortedMap interface.
  7. Some general exceptions:
      1. NoSuchElementException - when no items are contained in the invoking set.
      2. ClassCastException: if an attempt is made to add an incompatible object.
      3. NullPointerException: when trying to store a null object.
      4. IllegalArgumentException: if an invalid argument is used.
  
  ## Some methods declared are:
  1. Comparator< ? super E> comparator()
  2. E first()
  3. SortedSet<E> headSet(E end) - returns a sortedset containing those elemnts less than end.
  4. E last() 
  5. SortedSet<E> subSet(E start, E end) - contains element  between start and end - 1.
  6. SortedSet<E> tailSet(E start) - contains those elements grater than or equal to start.

# 11. NavigableSet interface : All you need to know: 
Syntax: public interface Navigable<E> extends SortedSet<E>
  1. It is the child interface  of SortedSet.
  2. SortedSet extended with navigation methods to return the closest match for given search targets.
  
  
  
  ## Methods declared are:
 1. E	ceiling(E e) - Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
2. Iterator<E>	descendingIterator()
Returns an iterator over the elements in this set, in descending order.
3. NavigableSet<E>	descendingSet()
Returns a reverse order view of the elements contained in this set.
4. E	floor(E e)
Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
5. SortedSet<E>	headSet(E toElement)
Returns a view of the portion of this set whose elements are strictly less than toElement.
6. NavigableSet<E>	headSet(E toElement, boolean inclusive)
Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement.
7. E	higher(E e)
Returns the least element in this set strictly greater than the given element, or null if there is no such element.
8. Iterator<E>	iterator()
Returns an iterator over the elements in this set, in ascending order.
9. E	lower(E e)
Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
10. E	pollFirst()
Retrieves and removes the first (lowest) element, or returns null if this set is empty.
11. E	pollLast()
Retrieves and removes the last (highest) element, or returns null if this set is empty.
12. NavigableSet<E>	subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
Returns a view of the portion of this set whose elements range from fromElement to toElement.
13. SortedSet<E>	subSet(E fromElement, E toElement)
Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
14. SortedSet<E>	tailSet(E fromElement)
Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
15. NavigableSet<E>	tailSet(E fromElement, boolean inclusive)
Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement.
  
  # Working with Maps
  
  ## What is a map?
  A map is an object that stores associations between keys and values i.e., key/value pairs.
  - Both keys and values are objects. For a given key you can find a value.
  - The keys must be unique
  - values may be duplicated
  
  NOTE:
  1. Maps don't implement the Iterable Interface. This means you cannot cycle through a map using a for-each style for loop.
  2. You can't obtain iterator to a map.
  3. Possible to obtain a collection-view of a map.
  
  
  # 12. Map Interface : All you need to know:
  Syntax: public interface Map<K,V>
  1. AN object that maps unique keys to values
  2. Keys cannot be duplicated. Values may be duplicated.
  3. Each key can map to atmost one value.
  4. This interface takes the place of Dictionary class(an abstract class).
  5. It is not a child interface of Collection Interface.
  6. Some general exceptions are:
      1. UnsupportedOperationException - if a collection cannot be modified.
      2. ClassCastException: if an attempt is made to add an incompatible object.
      3. NullPointerException: when trying to store a null object.
      4. IllegalArgumentException: if an invalid argument is used.
  ## Methods declared are:
  
  1. void	clear() - Removes all of the mappings from this map (optional operation).
  2. default V	compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
  3. default V	computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction) - 
If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
  4. default V	computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction) - 
If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
  5. boolean	containsKey(Object key) - 
Returns true if this map contains a mapping for the specified key.
  6. boolean	containsValue(Object value) - 
Returns true if this map maps one or more keys to the specified value.
  7. Set<Map.Entry<K,V>>	entrySet() - 
Returns a Set view of the mappings contained in this map.
  8. boolean	equals(Object o) - 
Compares the specified object with this map for equality.
  9. default void	forEach(BiConsumer<? super K,? super V> action) - 
Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
  10. V	get(Object key) - 
Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
  11. default V	getOrDefault(Object key, V defaultValue)
Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
  12. int	hashCode()
Returns the hash code value for this map.
  13. boolean	isEmpty()
Returns true if this map contains no key-value mappings.
  14. Set<K>	keySet()
Returns a Set view of the keys contained in this map.
  15. default V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
  16. V	put(K key, V value)
Associates the specified value with the specified key in this map (optional operation).
  17. void	putAll(Map<? extends K,? extends V> m)
Copies all of the mappings from the specified map to this map (optional operation).
  18. default V	putIfAbsent(K key, V value)
If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
  19. V	remove(Object key)
Removes the mapping for a key from this map if it is present (optional operation).
  20.default boolean	remove(Object key, Object value)
Removes the entry for the specified key only if it is currently mapped to the specified value.
  21. default V	replace(K key, V value)
Replaces the entry for the specified key only if it is currently mapped to some value.
  22. default boolean	replace(K key, V oldValue, V newValue)
Replaces the entry for the specified key only if currently mapped to the specified value.
  23. default void	replaceAll(BiFunction<? super K,? super V,? extends V> function)
Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the   function throws an exception.
  24. int	size()
Returns the number of key-value mappings in this map.
  25. Collection<V>	values()
Returns a Collection view of the values contained in this map.

# 13. SortedMap Interface: All you need to know:
Syntax: public interface SortedMap<K,V> extends Map<K,V>
  1. It is the child interface of Map interface.
  2. It does not allow duplicate elements.
  3. All the elements are sorted based on default natural sorting order.
  4. Some general exception thrown are:
      1. ClassCastException: if an attempt is made to add an incompatible object.
      2. NullPointerException: when trying to store a null object.
      3. IllegalArgumentException: if an invalid argument is used.
      4. NoSuchElementException: if the map is empty.
  5. Methods Declared are:
    1. Comparator<? super K>	comparator() - 
Returns the comparator used to order the keys in this map, or null if this map uses the natural ordering of its keys.
    2. Set<Map.Entry<K,V>>	entrySet() - 
Returns a Set view of the mappings contained in this map.
    3. K	firstKey() - 
Returns the first (lowest) key currently in this map.
    4. SortedMap<K,V>	headMap(K toKey) - 
Returns a view of the portion of this map whose keys are strictly less than toKey.
    5. Set<K>	keySet() - 
Returns a Set view of the keys contained in this map.
    6. K	lastKey() - 
Returns the last (highest) key currently in this map.
    7. SortedMap<K,V>	subMap(K fromKey, K toKey) - 
Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive.
    8. SortedMap<K,V>	tailMap(K fromKey) - 
Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
    9. Collection<V>	values() - 
Returns a Collection view of the values contained in this map.
  
  
  
  
  
  
  


