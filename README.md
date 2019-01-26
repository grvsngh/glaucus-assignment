# glaucus-assignment
# Database Details:
--
-- Create database SpringMVC
--

CREATE DATABASE SpringMVC;

--
-- Table structure for table Number
--


CREATE TABLE Number (
  number int(11) NOT NULL DEFAULT '0'
)

--
-- increment of number  for table Number
--

UPDATE  Number SET number=number+1

--
-- Selecting number from table Number
--

SELECT * FROM Number;

url : "jdbc:mysql://localhost:3306/SpringMVC", username: "root",	password: "" 


# run command:
mvn clean install jetty:run
