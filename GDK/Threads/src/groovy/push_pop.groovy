package groovy

List numbers=[]

//push
10.times {
    println "push:\t ${it}"
    numbers <<it
}
println numbers

//pop
for(i in 9..0){
    println("pop:\t ${i}")
    numbers.pop()
}

println numbers

