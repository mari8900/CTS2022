Bachelor paper topic:
    Postal Appointments Application

Description of the problem:
    For an easier interaction of the user with the application, we want to give them the ability to create
    appointments with the help of a single class, the factory, thus centralizing the 
    process of creation. The appointments are of three kinds - simple appointment, with only the date settled,
    appointments with the hour settled as well, and appointments where you could also select to which 
    postal office the parcel to be delivered.
     
Advantages:
    - if anything is changed in the code, it will not break on the client part
    - objects are built through a common interface, not directly

Disadvantages:
    - many classes to operate which leads to a higher complexity of the project