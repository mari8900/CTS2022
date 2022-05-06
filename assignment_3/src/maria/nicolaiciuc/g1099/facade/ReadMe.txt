Bachelor paper topic:
    Postal Appointments Application

Description of the problem:
    We need a simplified way to test all the implementations of this project.

Advantages:
    - reduce the number of times you call the same class 
    - calls to different interfaces are hidden by this common interface
    - an intermediate layer is created for an easier and quicker management of the methods used

Disadvantages:
    - raises the number of wrapper classes
    - raises the complexity of the code by hiding some methods
    - may have a negative impact on the performance of the application