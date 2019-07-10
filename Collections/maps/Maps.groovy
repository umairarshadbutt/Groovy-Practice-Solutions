def map = [:]
println map
println map.getClass().getName()

def person = [first:"Umair",last:"Arshad",email:"umair6622@gmail.com"]
println person
println person.first

person.twitter = "@umairbuttpaakdaman"
println person

def emailKey = "EmailAddress"
def twitter = [username:"@umairarshad",(emailKey):"umair6622@gmail.com"]

println person.size()
println person.sort()

// looping through person
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {
    println "$key:${person[key]}"
}

// each | eachWithIndex