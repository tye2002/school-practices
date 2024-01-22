# Requirement:
Based on the class diagram specified by UML (in the picture), implement the program in the Java programming language:

![Alt text][def]

Where:
- For each derived class, you need to implement 3 constructors: parameterized constructor, nonparameterized constructor, and copy constructor.
- Method **getArea()** returns the area of the object corresponding to each class, which is calculated
by the following formulas:
    + 𝑆𝐶𝑖𝑟𝑐𝑙𝑒 = 3.14 x radius x radius
    + 𝑆𝐶𝑦𝑙𝑖𝑛𝑑𝑒𝑟 = 𝑆𝐶𝑖𝑟𝑐𝑙𝑒 x height
- Method **getPerimeter()** returns the perimeter of an object of class Circle:
    + 𝑃𝐶𝑖𝑟𝑐𝑙𝑒 = 3.14 x 2 x radius
- Method **getLSurface()** returns the volume of an object of class Cylinder:
    + 𝐴𝐶𝑦𝑙𝑖𝑛𝑑𝑒𝑟 = 3.14 x 2 x radius x height
- Method **toString()** returns a string containing the attributes’ value of an object. For example, for the Cylinder class, the **toString()** method returns a string containing the radius and height.

[def]: UML.png