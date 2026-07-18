# MiniDB Core

A lightweight **file-based relational database engine** implemented entirely in **Core Java** without using any external libraries or frameworks. The project demonstrates the fundamentals of database management systems, object-oriented programming, file handling, and query execution.

## Features

* Pure Java implementation (No Maven/Gradle dependencies)
* In-memory table management
* Create tables
* Insert records
* Retrieve records
* Simple command-line interface
* Modular and extensible architecture
* Beginner-friendly implementation for understanding database internals

## Technologies Used

* Java 17+ (Compatible with Java 21)
* Java Collections Framework
* Object-Oriented Programming
* File Handling (Extendable)
* Exception Handling

## Example

```java
Database db = new Database();

db.createTable("employee");

db.insert("employee", "1|John|50000");

db.insert("employee", "2|Alice|70000");

db.selectAll("employee");
```

Output

```text
1|John|50000
2|Alice|70000
```
