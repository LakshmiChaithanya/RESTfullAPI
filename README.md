# RESTfullAPI
Examples on RESTful API in Java
Used dependencieis:
  Jersy-Json
  Jersy-core
  Jersy-server
  Jersy-bundle
Server used:
  tomcat8.0.5
Usecase covered in this Project:
  * REST API GET request to publish data as a json array element that contains list of numbers and their corresponding sum 
      *Input : A file contains lines.
               Each line is a stream of integers delimited by comma
               Ex: 
               1,2,3,4,5,6,7
               8,9,10,11,12
               13,14,15,16
               12
      * Response :
          Output: Json format
          Ex : 
          {"sumReponse":[
                            {
                              "numbers":[1,2,3,4,5,6,7],
                              "runningTotal":28
                             },
                            {
                              "numbers":[8,9,10,11,12],
                              "runningTotal":50
                            },
                            {
                              "numbers":[13,14,15,16],
                              "runningTotal":58
                            },
                            {
                              "numbers":[12],
                              "runningTotal":12
                            }
                        ]
          }

Resourse link :
http://localhost:8080/apiExample/sum
