import groovy.sql.Sql

String username ="facebook"
String password="password"

def sql=Sql.newInstance("jdbc:mysql:/home/azaidi/git/groovy/GDK/Databases", username, password,com.mysql.jdbc.Driver)

sql.execute('DROP TABLE IF EXISTS users')
sql.execute '''
CREATE TABLE users(
  id INT NOT NULL ,
  username VARCHAR (45) NOT NULL,
  bio VARCHAR (45) NOT NULL,
  PRIMARY KEY (id)
);
'''

