* Programing Language 

# Syntax - Set of rules
________________________

JVM (Java virtual machine) - is an abstract machine that enables your computer to run java programme.
When you run the java program, Java compiler first compiles your java code to bytecode. Then, the JVM translate bycode into native machine code  (set of instructions that a computers CPU executes directly)

JRE (JAVA RUNTIME ENVIRONMENT) - is a software package that provide java class libraries, Java Virtual Machine (JVM), and others components that are required to run java applications.

JDK (JAVA DEVELOPMENT KIT) - is a software development kit required to develop application Java, 
In addition to JRE, JDK also contains a number of development tools (Compilers, JavaDoc, Java, Debugger, etc)

-------------------------------------------------------------------------------------------------------------

# JAVA KEYWORDS 

abstract, continue, for, new, switch, assert, default, goto, package, synchronized, boolean, do, if, private, this, break,
double, implements, protected, throw, byte, else, import, public, throws, case, enum, instanceof, retrun, transient, catch,
extends, int, short, try, char, final, interface, static, void, class, finally, long, strictfp, volatile, const, float,
native, super, while

-------------------------------------------------------------------------------------------------------------

# Rules for Naming Variables in Java => 
Java is case-sensitive, Hence age and AGE are two different variables.
* Variables must start with either a letter or an underscore, _ or a dollar sign, $ sign
* Variable names can not use whitespace
* Variable names can not be keywords

# Example: 
int age = 20;
int AGE = 20 // Two different variable

-------------------------------------------------------------------------------------------------------------

# DATA TYPE (PRIMITIVE)

int, float, char, boolean, byte, short, long, bouble

| Data Type   | Size                   | Range                 | Default Value |
| ----------- | ---------------------- | --------------------- | ------------- |
| **byte**    | 1 byte (8 bits)        | −128 to 127           | `0`           |
| **short**   | 2 bytes (16 bits)      | −32,768 to 32,767     | `0`           |
| **int**     | 4 bytes (32 bits)      | −2³¹ to 2³¹−1         | `0`           |
| **long**    | 8 bytes (64 bits)      | −2⁶³ to 2⁶³−1         | `0L`          |
| **float**   | 4 bytes (32 bits)      | ~6–7 decimal digits   | `0.0f`        |
| **double**  | 8 bytes (64 bits)      | ~15–16 decimal digits | `0.0d`        |
| **char**    | 2 bytes (16 bits)      | `\u0000` to `\uFFFF`  | `'\u0000'`    |
| **boolean** | JVM dependent (≈1 bit) | `true / false`        | `false`       |

---------------------------------------------------------------------

# IMPLICIT CONVERSION

byte → short → int → long → float → double
           char ────────────↑

# EXPLICIT CONVERSION

# Explicit Data Type Conversion in Java (Type Casting / Narrowing)

int age = 128;
byte = newAge = (byte)age;  // typecasting

# Explicit conversion (also called narrowing) is done manually by the programmer when:

<!-- DATA CASTING TYPE CASTING -->

* Converting a larger data type → smaller data type
* There may be data loss
* Java does NOT do it automatically

# SYNTAX => targetType variable = (targetType) value; 

# Single line comment
// single line comment

# Multiline commnet

/* multiline comment */

-------------------------------------------------------------------------------------

# BINARY NUMBER SYSTEM, JAVA OPERATORS & TAKING USER INPUT

1. Binary number system (1 or 0)
# Convert Decimal to Binary


-------------------------------------------------------------------------------------
# Types of Operators in Java

1. Arithmetic Operators

| Operator | Meaning        | Example |
| -------- | -------------- | ------- |
| `+`      | Addition       | `a + b` |
| `-`      | Subtraction    | `a - b` |
| `*`      | Multiplication | `a * b` |
| `/`      | Division       | `a / b` |
| `%`      | Modulus        | `a % b` |

-------------------------------------------------------------------------------------
2. Assignment Operators

| Operator | Example  | Meaning     |
| -------- | -------- | ----------- |
| `=`      | `a = 10` | Assign      |
| `+=`     | `a += 5` | `a = a + 5` |
| `-=`     | `a -= 5` | `a = a - 5` |
| `*=`     | `a *= 2` | `a = a * 2` |
| `/=`     | `a /= 2` | `a = a / 2` |


-------------------------------------------------------------------------------------

1. Relational (Comparison) Operators

| Operator | Meaning               |
| -------- | --------------------- |
| `==`     | Equal to              |
| `!=`     | Not equal             |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |

-------------------------------------------------------------------------------------

# Taking user input Scanner

In order to use the object of scanner, we need to import java.util.Scanner package.

1. Various Input types using Scanner

we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long, float, double and string input respectively from the user.


-------------------------------------------------------------------------------------

# JAVA CONDITIONAL STATEMENT

The if statements executes a certain section of code id the last expression is evaluated true.

Statements inside the body of else block are executed if the test expression is evaluated to false. This is known as the IF...ELSE statement in java. 


>> Java if - else if - else statement

In Java we have an if-else if ledder, that can we used to execute one block of code among multiple other blocks

1.  Nested if else statement

In Java we have an if...else.. if that can be used to execute one block of code among multiple other blocks.

-------------------------------------------------------------------------------------

# Ternary Operator in Java (?:) — Simple & Practice-Ready

1. The ternary operator is a short form of if–else used to make decisions in one line.

# SYNTAX => condition ? expression1 : expression2;
