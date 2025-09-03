# Lab 03 – Truckloads of Asphalt

This project is part of my Computer Science coursework at **Arizona State University (ASU)**.  
The goal of this lab is to practice using **Java variables, user input, type casting, math operations, and formatted output** by writing a program that calculates the number of truckloads of asphalt required for a new road construction project and the total cost of that asphalt.

---

## 📋 Problem Description

A construction company needs to know:
1. How many **truckloads of asphalt** are required for a road project.
2. The **total cost of asphalt** for the project.

The program takes three inputs from the user:

- Length of the road in miles (`double`)  
- Number of lanes (`int`)  
- Depth of asphalt in inches (`int`)  

The program then computes:
- The total number of truckloads (rounded **up** to the nearest whole number).  
- The total cost of the asphalt, assuming asphalt is purchased by the whole truckload.  

---

## ⚙️ Hints and Given Info

- 1 mile = **5280 feet**  
- 1 lane = **12 feet wide**  
- Asphalt weighs **145 pounds per cubic foot**  
- 1 U.S. ton = **2000 pounds**  
- 1 truck carries **5 tons**  
- Asphalt costs **$150 per ton**

---

## 🖥️ Example Runs

### Example 1
Enter length of road in miles : 1
Enter number of lanes : 2
Enter depth of asphalt in inches: 12

Truckloads of asphalt needed is : 1838
Total cost of asphalt is : $1378500.00


### Example 2
Enter length of road in miles : 2.75
Enter number of lanes : 3
Enter depth of asphalt in inches: 10

Truckloads of asphalt needed is : 6317
Total cost of asphalt is : $4737750.00


---

## 🚀 How to Compile and Run

1. Save the file as **`Asphalt.java`** (the filename must match the `public class Asphalt`).  
2. Open a terminal in VS Code (or command line).  
3. Navigate to the folder where the file is saved.  
4. Compile the program:
   ```bash
   javac Asphalt.java
5. Run the program

   ```bash
   java Asphalt
