JDK (Java Development Kit) is a development for building applications and components using the Java programming Language

MongoDBAtles - allows to spin up mongodb servers on the cloud, cloud service provider of your choice, (AWS, Azure, Google cloud)

MongoDB Compass - Database client to connect with db

Spring boot - java framework
Spring Initializer
- Build automotaion tool for java - eg Maven, Gradle


Lombok - Java annotation library which helps reduce boilerplate code

Spring Web - Build web including RESTful app using Spring MVC. Uses Apache Tomcat as the default embedded container.

Spring Data MongoDB - Stores data in flexible JSON-like documents, meaning field can vary from document to document and dta structure can be changed overtime

Spring Boot DevTools - provide fast application restarts, live reload and configurations for enhanced development experience

Tomcat - development web server for the app (port 8080)



steps:
1. Configure the database for our app to connect to mongodb cluster and talk to it

App will have 3 layers:
    Service layer
    Data Access Layer
    API layer - Controller -> getting request from user and returning the repsonse


controller - task is getting a request from the user and returning a response 
calls allMovies method inside the service, gets the list of movies and returns them with a http status of 200
In REST APIs there are multiple layers



Client
- Interface with a remote API from frontend app created using React
Retrieve data from a mongodb database 
post data to mongodb 

data retrieved from server  is in json form.
Transform dta in a json into visually pleasing frontend display

moviedb.org - movie poster images & backdrop images comes from here


packages:
axios - makes it easy to:
i)  make http requests from our react client to relevant API so as to retrieve different data from mongoDB (res, req)
ii). Add movie reviews to the database through use of http POST req

bootstrap  - use bootstrap for layout and styling

react-bootstap - allows use of bootstrap related components fr layout and styling purposes 

fortawesome/react-fontawesome - font awesome icons within react project

react-player - to play movie trailers within our app

react-router-dom  -- declare the paths where components reside inorder to map the routes to our components

ngrok - ngrok combines your reverse proxy, firewall, API gateway, and global load balancing to deliver apps and APIs.