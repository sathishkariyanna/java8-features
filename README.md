# java8-features
**Some of the important Java 8 features are**

1. Java Stream API
2. forEach() method in Iterable interface
3. default and static methods in Interfaces
4. Functional Interfaces and Lambda Expressions
5. Java Time API
6. Collection API improvements
7. Concurrency API improvements
8. Optional class

**Lambda expression vs method in Java**

A method (or function) in Java has these main parts:
1. Name
2. Parameter list
3. Body
4. return type.

A lambda expression in Java has these main parts:
Lambda expression **only has body and parameter list**.                                                                                 
1. **No** name -- function is anonymous so we don't care about the name                                                                  
2. Parameter list                                                                                                              
3. Body -- This is the main part of the function.                                                                                      
4. **No** return type -- The java 8 compiler is able to infer the return type by checking the code. you need not to mention it explicitly.                                                                       

Where to use the Lambdas in Java
--------------------------------

To use lambda expression, you need to either create your own functional
interface or use the pre defined functional interface provided by Java.
An interface with **only single abstract method** is called functional
interface(or Single Abstract method interface), for example: Runnable,
callable, ActionListener etc.

**To use function interface:**\
Pre Java 8: We create anonymous inner classes.\
Post Java 8: You can use lambda expression instead of anonymous inner
classes.

**Method reference**

The **::** operator is used in method reference to separate the class or
object from the method name(we will learn this with the help of
examples).

Four types of method references
-------------------------------

1. Method reference to an instance method of an object --
object::instanceMethod\
2. Method reference to a static method of a class --
Class::staticMethod\
3. Method reference to an instance method of an arbitrary object of a
particular type -- Class::instanceMethod\
4. Method reference to a constructor -- Class::new

Functional interface
--------------------

An interface with **only single abstract method** is called functional
interface. You can either use the predefined functional interface
provided by Java or create your own functional interface and use it. You
can check the predefined functional interfaces here: **predefined
functional interfaces** they all have only one abstract method. That is
the reason,they are also known as Single Abstract Method interfaces (SAM
Interfaces).

To use **lambda expression in Java,** you need to either create your own
functional interface or use the pre defined functional interface
provided by Java. While creating your own functional interface, mark it
with **\@FunctionalInterface** annotation, this annotation is introduced
in Java 8. Although its optional, you should use it so that you get a
compilation error if the interface you marked with this annotation is
not following the rules of functional interfaces.

What are the rules of defining a functional interface?
------------------------------------------------------

The functional interface should have **Only one** abstract method. Along
with the one abstract method, they can have any number of default and
static methods.

Interface Changes -- default method and static method
============================================================

Prior to java 8, **interface in java** can only have abstract methods.
All the methods of interfaces are public & abstract by default. Java 8
allows the interfaces to have default and static methods.

Why default method?
-------------------

For example, if several classes such as A, B, C and D implements an
interface XYZInterface then if we add a new method to the XYZInterface,
we have to change the code in all the classes(A, B, C and D) that
implements this interface. In this example we have only four classes
that implements the interface which we want to change but imagine if
there are hundreds of classes implementing an interface then it would be
almost impossible to change the code in all those classes.

**Static methods** in interfaces are similar to the default methods
except that we cannot override these methods in the classes that
implements these interfaces.

Abstract classes vs interfaces
----------------------------------------

With the introduction of default methods in interfaces, it seems that
the **abstract classes** are same as interface in java 8. However this
is not entirely true, even though we can now have concrete
methods(methods with body) in interfaces just like abstract class, this
doesn't mean that they are same. There are still few differences between
them, one of them is that abstract class can have constructor while in
interfaces we can't have constructors.

The purpose of interface is to provide full abstraction, while the
purpose of abstract class is to provide partial abstraction. This still
holds true. The interface is like a blueprint for your class, with the
introduction of default methods you can simply say that we can add
additional features in the interfaces without affecting the end user
classes.

If two Interface have the same default method names and we are
implementing both of them, then we get an error "Error: Duplicate
default methods named newMethod with the parameters () and () are
inherited from the types MyInterface2 and MyInterface"

To solve this problem, we can implement this method in the
implementation class

Stream
=============

By using streams we can perform various aggregate operations on the data
returned from collections, arrays, Input/Output operations.

How to work with Stream in Java
-------------------------------

As we have seen in the above example, the working of stream can be explained in three stages:                                           
1. Create a stream
2. Perform **intermediate operations** on the initial stream to
transform it into another stream and so on on further intermediate
operations. In the above example, the filter() operation is intermediate
operation, there can be more than one intermediate operations.
3. Perform **terminal operation** on the final stream to get the result.
In the above example, the count() operation is terminal operation.

Java Stream Features
--------------------

1. Stream **does not store** the elements. it simply performs the
aggregate operations(such as filter() and count() that we have seen in
the above example) to get the desired stream of data.

2. The aggregate operations that we perform on the collection, array or
any other data source **do not change** the data of the source, they
simply return a new stream. For example the code we have seen above is
filtering the strings with length less than 6 using the stream
operations but it didn't change the elements of the list.

3. All the stream operations are **lazy** in nature which means they are
not executed until they are needed. For example, if we want to display
only the first 2 elements of a list using stream, the stream operation
would stop at the end of second iteration after displaying the second
element of list.

Java Stream Aggregate Functions Examples (Intermediate Operations)
==================================================================
## 1. The filter operation

The **filter()** is an intermediate operation that reads the data from a
stream and returns a new stream after transforming the data based on the
given condition

List\<String\> names =
Arrays.asList(\"Melisandre\",\"Sansa\",\"Jon\",\"Daenerys\",\"Joffery\");

//Creating the stream of all names

Stream\<String\> allNames = names.stream();

//Creating another stream by filtering long names using filter()

Stream\<String\> longNames = allNames.filter(str -\> str.length() \> 6);

//displaying the long names

longNames.forEach(str-\>System.out.print(str+\" \"));

## 2. The map operation

The map operation returns a new stream consisting of elements which are
the results of applying a given function to the elements of the current
stream. For example, converting a stream of Objects to a stream of
String or a stream of primitive numbers.

The Stream API provides 4 methods for the map operation:

-   **map()**: transforms a stream of objects of type T to a stream of objects of type R.

-   **mapToInt()**: transforms a stream of objects to a stream of int primitives.

-   **mapToLong()**: transforms a stream of objects to a stream of long primitives.

-   **mapToDouble()**: transforms a stream of objects to a stream of double primitives.

## 3. The sorted operation

The Stream API provides two overloads of the sorted operation that
returns a new stream consisting elements sorted according to natural
order or by a specified comparator:

-   **sorted()**: sorts by natural order

-   **sorted(comparator)**: sorts by a comparator

## 4. The distinct operation

The **distinct()** operation returns a stream consisting of the distinct
elements (no duplicates) by comparing objects via their equals() method.

## 5. The limit operation

The **limit()** operation returns a stream containing only a specified
number of elements. Combining with the sorted()operation, the following
example shows top 5 youngest persons:

## 6. The skip operation

The **skip()** operation returns a stream containing the remaining
elements after discarding the first n elements of the stream.

## Steps to sort a Map in Java 8.

Convert a Map into a Stream

1. Sort it

2. Collect and return a new LinkedHashMap (keep the order)

Map result = map.entrySet().stream()
	.sorted(Map.Entry.comparingByKey())
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	(oldValue, newValue) -> oldValue, LinkedHashMap::new));

**flatMap in Streams**

flatMap() method allows avoiding nested Stream<Stream<R>> structure.

Stream<String[]>  -> flatMap ->  Stream<String>
Stream<Set<String>>  -> flatMap ->  Stream<String>
Stream<List<String>>  -> flatMap ->  Stream<String>
Stream<List<Object>>  -> flatMap ->  Stream<Object>

How flatMap() works :

{ {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}
{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}

Java 8 -- Stream Collectors
===========================

Collectors is a **final class** that extends the Object class

Java 8 StringJoiner
===================

Using this class we can join more than one strings with the specified
delimiter, we can also provide prefix and suffix to the final string
while joining multiple strings.

StringJoiner mystring = new StringJoiner(\"-\");
mystring.add(\"Sony\");
mystring.add(\"Nagendrappa\");

o/p : Sathish-kariyanna

StringJoiner mystring = new StringJoiner(\"-\", "(", ")" );
mystring1.add(\"Sathish\");
mystring1.add(\"Kariyanna\");

o/p : (Sathish-kariyanna)

StringJoiner mergeString = mystring1.merge(mystring);

o/p : (Sathish-kariyanna-Sony-Nagendrappa)

**Java 8 Optional**

Java 8 has introduced a new class Optional in java.util package. It is used to represent a value is present or absent. The main advantage of this new construct is that No more too many null checks and NullPointerException. It avoids any runtime NullPointerExceptions and supports us in developing clean and neat Java APIs or Applications. Like Collections and arrays, it is also a Container to hold at most one value. Let us explore this new construct with some useful examples.

**Advantages of Java 8 Optional:**

1. Null checks are not required.
2. No more NullPointerException at run-time.
3. We can develop clean and neat APIs.
4. No more Boiler plate code

Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.

Optional.ifPresent() performs given action if the given Optional object is non-empty. Otherwise it returns false.

Java 8 -- Arrays Parallel sort
==============================

Java 8 introduced a new method parallelSort() in the Arrays class of java.util package. This method is introduced to support the parallel sorting of array elements.              
Algorithm of parallel sorting:                                                                                                          
1. The given array is divided into the sub arrays and the sub arrays are further divided into the their sub arrays, this happens until the sub array reaches a minimum granularity.                                                                                           
2. The sub arrays are sorted individually by multiple threads. The parallel sort uses **Fork/Join Framework **for sorting sub arrays
parallelly.                                                                                                                             
3. The sorted sub arrays are merged.                            

**Advantage of Parallel Sort Over Simple Sort:**                                                     
The parallelSort() method uses the concept of **multithreading **which makes it much faster compared to the **normal sort** when there are lot of elements.

int numbers\[\] = {22, 89, 1, 32, 19, 5};

//Parallel Sort method for sorting int array

Arrays.parallelSort(numbers);

//converting the array to stream and displaying using forEach

Arrays.stream(numbers).forEach(n-\>System.out.print(n+\" \"));

## Java Date Time APIs

In old days, we use the following classic Date and Calendar APIs to represent and manipulate date.

-   `java.util.Date` – date and time, print with default time-zone.
-   `java.util.Calendar` – date and time, more methods to manipulate date.
-   `java.text.SimpleDateFormat` – formatting (date -> text), parsing (text -> date) for date and calendar.
-   `java.time.LocalDate` – date without time, no time-zone.
-   `java.time.LocalTime` – time without date, no time-zone.
-   `java.time.LocalDateTime` – date and time, no time-zone.
-   `java.time.ZonedDateTime` – date and time, with time-zone.
-   `java.time.DateTimeFormatter` – formatting (date -> text), parsing (text -> date) for java.time

**How to re-use closed**

if you try to reuse the used stream again it will throw an IllegalStateException, saying “stream is closed”.

For whatever reason, you really want to reuse a Stream, then you need to use **Supplier**
