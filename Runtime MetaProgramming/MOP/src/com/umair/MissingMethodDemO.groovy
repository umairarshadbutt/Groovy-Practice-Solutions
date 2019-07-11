package com.umair

class MyEmployee {

    def methodMissing(String name, def arg){

        if(name != 'someMethod'){
            throw new MissingMethodException(name, arg)
        }

        println "Method Missing called on: $name"
        println "with argument ${arg}"
    }
}


MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,3)
//emp.someOtherMethod(4,5,6)
