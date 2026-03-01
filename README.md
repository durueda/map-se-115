 # Country Map & Way Finder (Java)
A Java-based map navigation system that models cities as nodes and connections as paths, allowing users to explore routes between locations.
The project demonstrates graph data structures, path-finding logic, and object-oriented design principles.

## Project Overview
 ### This project simulates a country map where:
-Cities are represented as nodes.

-Connections between cities represent roads (edges).

-A path-finding algorithm determines routes between cities.

-Users can interact through a main driver class.
### It focuses on applying core Computer Science concepts such as:
-Graph data structures

-Traversal algorithms

-Object-Oriented Programming (OOP)

-Separation of concerns

## Project Structure

├── City.java
├── CountryMap.java
├── WayFinder.java
├── Main.java

#### 🔹 City.java
Represents a city node in the graph.
Stores city name
Maintains connected cities
Handles city-level behaviors
#### 🔹 CountryMap.java
Represents the overall map structure.
Manages cities
Stores connections
Builds and maintains the graph
#### 🔹 WayFinder.java
Implements the path-finding logic.
Finds routes between cities
Applies traversal algorithms (e.g., BFS/DFS depending on implementation)
Returns the computed path
#### 🔹 Main.java
Entry point of the application.
Creates map data
Connects cities
Executes route-finding logic
Displays results
## How to Run
1️⃣ Requirements
Java 17+ (or compatible version)
IntelliJ IDEA / Eclipse / VS Code (recommended)

2️⃣ Compile & Run (Terminal)
javac *.java
java Main
Or simply run Main.java from your IDE.

## Core Concepts Used
Graph Representation (Adjacency List structure)
Breadth-First Search (BFS) or Depth-First Search (DFS)
Encapsulation
Modular Class Design
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
-Data Structures (Graphs)

-Algorithm implementation

-Clean architecture in Java

-Problem decomposition

## Author
Developed as part of a Java programming practice project.
Feel free to fork, improve, or expand it.
