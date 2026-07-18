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

## Project Structure

```text
MiniDBCore/
│
├── README.md
│
└── src/
    ├── Main.java
    └── Database.java
```

## How It Works

The application creates an in-memory database where each table is represented using Java collections.

Example workflow:

1. Create a table
2. Insert records
3. Retrieve all records

Current implementation stores records in memory and prints them to the console.

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

## Current Capabilities

* Create Table
* Insert Records
* Display All Records

## Future Enhancements

* SQL Parser
* File-based Storage
* Update Records
* Delete Records
* WHERE Clause
* ORDER BY
* LIMIT
* Aggregate Functions (COUNT, SUM, AVG, MIN, MAX)
* Primary Key Support
* Indexing
* Transactions
* Query Optimizer
* Binary Storage Engine
* CSV Import/Export
* Multi-threaded Query Execution

## Learning Objectives

This project was built to understand the core concepts behind relational database systems, including:

* Database architecture
* Storage engines
* CRUD operations
* Data structures
* Object-Oriented Design
* Collections Framework
* Separation of Concerns

## Build and Run

Compile

```bash
javac src/*.java
```

Run

```bash
java -cp src Main
```

## Sample Output

```text
1|John|50000
```

## Project Goals

The objective of MiniDB Core is to provide a minimal yet extensible database engine implemented entirely in Java. It serves as a foundation for experimenting with database concepts and can be expanded into a more complete SQL engine supporting parsing, indexing, persistence, and advanced query execution.

## License

This project is released under the MIT License and is free to use, modify, and distribute for educational and personal purposes.
