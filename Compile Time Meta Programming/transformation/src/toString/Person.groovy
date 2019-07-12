package toString

import groovy.transform.EqualsAndHashCode

//fot @ToString
//import groovy.transform.ToString
//@ToString(includeNames  = true, excludes = ["email"])

@EqualsAndHashCode (excludes = ["email"])
class Person {
    String first
    String last
    String email


}
