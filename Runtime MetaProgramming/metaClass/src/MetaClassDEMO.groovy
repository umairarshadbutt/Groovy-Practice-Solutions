

class Developer{

}

Developer developer = new Developer()

//Expando e = new Expando()
//e.name = 'Umair'
//e.writeCode = {->println "$name loves to write code"}
//e.writeCode()

developer.metaClass.name='Umair'
developer.metaClass.writeCode = {-> println "$name loves to write code..."}
developer.writeCode()

String.metaClass.shout = {-> toUpperCase()}
println "hello dan".shout()





