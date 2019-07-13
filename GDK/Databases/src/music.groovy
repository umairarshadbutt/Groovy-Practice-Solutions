import groovy.sql.Sql

String username ="facebook"
String password="password"

def sql=Sql.newInstance("jdbc:mysql:/home/azaidi/git/groovy/GDK/Databases", username, password,jdbc.Driver)
println "connected"

sql.close()

