# crud spring boot read me

This repo is for learning crud operations on Spring Boot.

We have 3 layer. Api Layer - Service Layer - Data Access Layer.

### API Layer

We have 4(get, post, delete, put) endpoints. I use some(@RestController, @RequestMapping etc.) annotations for building this layer. (StudentController.java)

### Service Layer

There is not too much bussiness logic actually. Basicly I implemented functions that I used on Controller class. (StundentService.java)

### Data Access Layer

For the DB operations I simply extends JpaRepository and thats it. (StudentRepository.java)