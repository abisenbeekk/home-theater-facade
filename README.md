# Home Theater Facade — Facade Design Pattern

## Course
**ShP-2216 Software Design Patterns**  
Astana IT University — School of Computer Engineering

## Student
Bissenbek Ayaulym

## Pattern
**Facade** (Structural Design Pattern)

## Description

This project demonstrates the **Facade design pattern** in Java. 
A `HomeTheaterFacade` class hides the complexity of a home theater 
subsystem consisting of 6 collaborating components:

- `Amplifier` — controls sound
- `DvdPlayer` — plays movies
- `Projector` — displays video
- `Screen` — controls the screen
- `Lights` — controls lighting
- `PopcornPopper` — makes popcorn

Instead of orchestrating all 6 components manually, the client 
calls only two simple methods:

```java
homeTheater.watchMovie("Inception");
homeTheater.endMovie();
