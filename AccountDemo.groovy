def foo={
    println it
}

foo('umair')

def noparams = {->
    println "no params..."
}

def someMethod(Closure c){
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = {int x, int y-> x+y}
someMethod(someClosure)



noparams()
