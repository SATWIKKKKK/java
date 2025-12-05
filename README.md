# java

# JAVA LAB – DAY 01

##  Introduction
Welcome to **Java Lab Day-01**.  
In this session, we learned:

- How to install and use **IntelliJ IDEA**
- How to create a **Java Project**
- How to write, run, commit & push the first **HelloWorld** program

## Author
Name :- Satwik Chandra
Section:- CSE-33
Roll No:- 2405900

##  1. Setting Up IntelliJ IDEA

### **Step 1: Install IntelliJ IDEA**
Download from: https://www.jetbrains.com/idea/

Choose either:
- **Community Edition (Free)**
- **Ultimate Edition (Paid)**


## 2. Creating Your First Java Project

### **Steps:**
1. Open IntelliJ IDEA
2. Click **New Project**
3. Select **Java**
4. Choose a **JDK version** (recommended: 17 or 21)
    - If not available, click **Download JDK**
5. Click **Next → Finish**
6. Inside the project, open the **src** folder
7. Right-click → **New → Java Class**
8. Name the class: `HelloWorld`


##  3. Writing Your First Java Program

Create a file named `HelloWorld.java` inside the `src` folder.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
