#Plural sight notes

-A Unit test is a type of code, the test tries to confirm that a small portion of code works properly. 
-It provides quick feedback. 
-Checks code immediately. 
-Anyone can access a test to see the documentation or how a code works.

<Applying Assertions>
-If you use an assertEquals to compare collections JUnit will check that the two collections contain equivalent objects using the equals method on each object 
and that they are in the same order. 
-assertEquals checks that 2 primitives/objects are equal
-assertTrue checks if a condition is true
-assertFalse checks if a condition is false
-assertNotNull checks that an object is not null
-assertNull checks that an object is null
-assertSame method tests if 2 object references point to the same object
-assertNotSame method tests if 2 object references do not point to the same object
-assertArrayEquals method will tests whether 2 arrays are equal to each other

<Testing Exceptions>

-JUnit provides an option for tracing an exception handling of code. You can test whether the code throws a desired exception or not. 

<Customizing test messages and reporting>

-JUnit 5 provides several ways that you can improve the clarity and even efficiency of results reporting. 

<Controlling Test Method Execution>

-@Disabled annotation disables the test from executing.
-@Disabled annotation disables and still shows the test method, however, it is ignored when running the tests.

<Running Groups of Tests>

-We can run certain tests instead of running all tests which could take longer and waste time. 
-@Tag a value above a test method and indicate that you want to run tests that run a certain tag expression. 
-You can set tags to classes or single test methods. 

<Understanding Single Responsibility Principle> 
-A unit of code should do one thing and do that one thing well
-Code Cohesion
  -The function of some units of code is closely related to one another 
-A given unit of code should only have one reason to change. 
-Mixed Concerns can make code hard to test.
  -You may not be able to get a hold of the output you would like to apply assertions to. They are sent directly to reports or user interfaces with no chance for a test to intercept them.
-Inaccessible inputs
  -You may not be able to provide inputs to the code you're trying to test.
  -For example business applications with user information often won't provide a way to supply those inputs.
-Undesirable Side Effects
  -Logic you'd like to test that's mixed with database access code may throw an exception if the database isn't available. 
  -Even if it is available it may slow the test down. 
-If we are trying to test code with mixed concerns, we need to extract. 
 -Extraction
  -Separate the code that you are trying to test from the rest of the code. 
  -Extraction can take many forms, for example, code can move to new methods, classes, and functions. 
  
<Understanding Dependencies> 
-Code rarely works in isolation 
-Such dependencies may be application code or library code. 
-Testing code that calls other code can be difficult, if it has side effects, talks to remote services that are not always present, or presents inconsistent behavior, all may make a unit test for the target code challenging.

-Creating a test double looks just like the real dependency to the target code, allowing code to be provided is called injection.  

<Understanding Test-driven Development>
-Rather than implementing a feature first, then testing it, drive the development of the feature from a test. 
-Works by frequently switching from test to production code and back.

<Benefits>
-Keeps you focused on what needs to be done next. 
-Produces testable designs. 
-Helps produce code with clear interfaces. 
-Helps produce clean code internally.

<Descriptions of TDD>
-The simplest form is to write just enough unit test code to fail. Then write just enough code to make the test compile and pass. 
-Another way to describe TDD is the red, green, refractor scale. 
-You have the failing unit test which may not compile 
-Write just enough production code to make that test compile and pass
-Then you can refractor what was just written to clean up the implementing code.
