package builder

Developer dan = Developer
    .builder()
    .firstName("Umair")
    .lastName("Arshad")
    .middleInitial("A")
    .email("umair6622@gmail.com")
    .hireDate(new Date())
    .langugages(["Java","Groovy"])
    .build()

println dan
assert dan.firstName == "Umair"
assert dan.lastName == "Arshad"
assert dan.langugages.size() == 2

