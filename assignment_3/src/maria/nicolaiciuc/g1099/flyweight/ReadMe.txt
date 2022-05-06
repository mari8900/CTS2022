Bachelor paper topic:
    Postal Appointments Application

Description of the problem:
    All types of appointments have 3 common fields - name of the person who wishes to create an appointment,
    the tracking number of their parcel, and the date of the appointment. It has been observed that for
    generating multiple appointments, there is a loss of time due to the checking of the available time
    intervals and the postal offices.
     
Advantages:
    - memory space allocated to objects can be minimized by sharing their common attributes
    - the state of the objects can be managed through external structures, and the effective number of
    created objects can be reduced
    - by using an object you are loading its state into an existing object

Disadvantages:
    - effects of the flyweight pattern are visible usually for projects in which the number of required 
    objects is large
    - memory space reduction depends on the number of object categories 