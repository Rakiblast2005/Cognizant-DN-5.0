# Singleton Pattern Example

## Objective

Implement the Singleton Design Pattern to ensure that only one instance of the Logger class is created and used throughout the application.

## Project Structure

SingletonPatternExample
└── src
 └── com
  └── exercise1
   └── singleton
    ├── Logger.java
    └── SingletonTest.java

## Classes

### Logger.java

The Logger class follows the Singleton Design Pattern.

Features:

* Private constructor to prevent direct object creation.
* Static instance variable to hold the single object.
* Thread-safe implementation using Double-Checked Locking.
* Provides logging methods for application messages.

### SingletonTest.java

The test class used to verify the Singleton implementation.

Features:

* Creates multiple references using `getInstance()`.
* Verifies that all references point to the same object.
* Tests concurrent access using multiple threads.
* Confirms that only one Logger instance exists.

## Output

Sample Output:

===== Singleton Validation =====

Logger initialized at 2026-06-22T21:37:58

[LOG] Application Started

[LOG] User Authentication Success

Logger1 HashCode : 1044036744

Logger2 HashCode : 1044036744

Same Instance ? true

===== Concurrent Access Test =====

[LOG] Executed by Worker-1

[LOG] Executed by Worker-2

[LOG] Executed by Worker-3

All threads received same instance : true

PASS : Singleton Pattern works correctly.

## Design Pattern Used

Singleton Pattern

The Singleton Pattern ensures that:

* Only one instance of a class is created.
* A global access point is provided to access the instance.
* Resources are used efficiently when a single shared object is required.

## Author

Rakesh N

Cognizant Digital Nurture 5.0 – Deep Skill Program
