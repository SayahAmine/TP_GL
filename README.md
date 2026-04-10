# TP_GL Project

## Overview
This repository contains coursework for **GL ISIL A** practical sessions (Travaux Pratiques).  
The project is split into **five parts**, each implemented in its own branch:

- **TP1** → Introduction to classes and objects  
- **TP2** → Aggregation  
- **TP3** → Composition  
- **TP4** → Association  
- **TP5-1 & TP5-2** → Advanced integration of all concepts  

Each branch contains its own environment classes that correspond directly to the exercises described in the TP PDFs.

---

## Tools
- **Java 17**
- **IntelliJ IDEA** (2025.3.1)
- **Lombok** annotations (`@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`, `@ToString`)  
  → Used to reduce boilerplate code for constructors, getters, setters, and `toString()` methods.

---

##  Project Structure (per branch)

### TP1
- Basic class definitions (`Person`, `Technician`, etc.)
- Introduction to inheritance and encapsulation.

### TP2
- Aggregation examples (`Supplier` ↔ `Equipment`).
- Demonstrates how one class can contain references to another without ownership.

### TP3
- Composition examples (`Equipment` contains `Component`).
- Inner classes and lifecycle dependency.

### TP4
- Association examples (`Technician` ↔ `Vehicle`, `Technician` ↔ `WorkshopManager`).
- Demonstrates bidirectional links and role designation.

### TP5-1 & TP5-2
- Integration of all concepts:
  - Abstract classes (`Person`)
  - Interfaces (`Reformable`)
  - Singleton (`WorkshopManager`)
  - Complex relationships (`Repair`, `Piece`, `Supplier`, `Equipment`, `Vehicle`)

---
Note (Ai was not used except in generating Main classes to test)
