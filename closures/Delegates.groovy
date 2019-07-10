// Delegates.groovy

def writer = {
    append 'Umair'
    append ' lives in Lahore'
}

def append(String s) {
    println "append() called with argument of $s"
}

StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()
