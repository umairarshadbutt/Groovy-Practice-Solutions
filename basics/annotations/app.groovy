// testing out our customer class

def d = new Date()
def c1 = new Customer(first:'Umair', last:'Arshad', age:21, since:d, favItems:['Books', 'Games'])
def c2 = new Customer('Umair', 'Arshad', 21, d, ['Books', 'Games'])
assert c1 == c2

c1.first = "Umair"