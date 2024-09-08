# StudentManagment

Student Managment Project 

In this Project, we handled the Api request coming from the FrontEnd side and onto response to that we Build the RestApi's to handle the request and giving the right response. We use the MVC approach to bread down the project into Three Layers, 
Three Layers are:
1. Contoller layer
2. Service Layer
3. DAO Layer
   
In contoller Layer We Handled The request And response Coming from the Front-End Side by using rest Api's. And this is also the layer which Integrates Frontend from Backend.
The Second Layer is the Service Layer which Provides the response and futher processing the request. the main Buisness Logic are writtern in the Service Layer.
The third Layer Known as DAO Layer, the Service Layer implements the Buisness Logic Wheras DAO deals with database operation, such as Queries, Persistance etc.

In this Project we achieve the ORM(Objesct Relational Mapping) using Hibernate which is the default implementation of SpringBooot.
and as for this Short Project we have used the IN-Memory database H2-Database. its relational Database Managment System written in java. it is Genrally Used in Unit testing purposes. 

Our Project Student Managment System has Basically 4 Functionalities:-
1. Add Student Record
2. Delete Student Record
3. Modify Student Record
4. List Student records

Its basicaly the CRUD Springboot Project For Learning The Basics Of SpringBoot And To learn how things workes on backend and how we can build restApis using SpringBoot.
