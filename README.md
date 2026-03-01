 # MAPS PROJECT (Java - SHORTEST PATH)
A Java-based map navigation system that models cities as nodes and connections as paths, allowing users to explore routes between locations.
This project is a Java-based graph navigation system that models cities as nodes and roads as weighted edges. Unlike simple traversal-based systems, this implementation focuses on **Dijkstra’s shortest path algorithm** to compute the minimum-distance route between two cities. The system efficiently determines the optimal path based on edge weights, demonstrating practical application of graph theory and algorithm optimization in Java.

## Project Overview
 ### This project simulates a country map where:
-Cities are represented as nodes.

-Connections between cities represent roads (edges).

-A path-finding algorithm determines routes between cities.

-Users can interact through a main driver class.
### It focuses on applying core Computer Science concepts such as:
-Dijkstra’s shortest path algorithm 

-Traversal algorithms

-Object-Oriented Programming (OOP)

-Separation of concerns

## Project Structure

├── City.java

├── CountryMap.java

├── WayFinder.java

├── Main.java

#### 🔹 City.java
Represents a city entity in the system.

Stores the city name and related data

Maintains connections using array-based structures

Acts as the fundamental data model for the map

This class focuses purely on data encapsulation and object representation.
#### 🔹 CountryMap.java
Responsible for managing the overall map structure.

Stores cities using a HashMap for efficient lookup

Maintains connections between cities

Uses array-based collections to manage adjacency relationships

Provides methods to add cities and create connections

Instead of using complex graph libraries, the structure is built manually using Map and Array data structures to ensure clarity and control.
#### 🔹 WayFinder.java
Implements the shortest-path logic using Dijkstra’s algorithm.

Uses HashMap to track distances between cities

Stores visited or processed cities

Maintains predecessor mapping to reconstruct the optimal route

Iteratively updates minimum distances based on edge weights

The algorithm operates directly on Map and Array structures rather than abstract graph frameworks, emphasizing fundamental data structure usage.
#### 🔹 Main.java
Application entry point.

Initializes city objects

Builds the map structure

Executes shortest-path operations

Displays computed routes

## How to Run
1️⃣ Requirements
Java 17+ (or compatible version)
IntelliJ IDEA / Eclipse / VS Code (recommended)

2️⃣ Compile & Run (Terminal)
javac *.java
java Main
Or simply run Main.java from your IDE.

## Core Concepts Used
Dijkstra’s shortest path algorithm
HashMap for distance tracking and node management
Array / ArrayList structures for adjacency storage
Path reconstruction using predecessor mapping
Object-Oriented Programming (OOP) principles
Clean Responsibility Separation

## Example Usage
 #### Example flow:
-Create cities

-Connect them

-Search for a route between two cities

-Display the result path
#### Example output might look like:
Route from CityA to CityD:
CityA -> CityB -> CityC -> CityD

## Possible Improvements
-Add weighted edges (distance-based shortest path with Dijkstra)

-Add user input from console

-File-based map loading

-GUI visualization (JavaFX)

-Error handling for invalid cities

-Unit testing (JUnit)

## Learning Purpose
#### This project was built to strengthen understanding of:
-Data Structures 

-Algorithm implementation

-Clean architecture in Java

-Problem decomposition

## Author
Developed as part of a Java programming practice project.
Feel free to fork, improve, or expand it.
