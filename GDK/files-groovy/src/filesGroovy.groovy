def file =new File('dummy.txt')
file.write("This is some text\n")


////new File('dummy.txt').text="..."
//
//file.append("I am some more text ....\n")
//
//List lines = file.readLines()
//lines.each { line ->
//    println line
//}

// eachFileRecurse
//String groovyCourse = '/home/azaidi/git/groovy/GDK/files-groovy'
//new File(groovyCourse).eachFileRecurse { files ->
//    // show all first
//    if( files.isFile() && files.name != '.git' ){
//        println files.name
//    }
//
//}


// list only certain files from this directory
new File('.').eachFile { files ->
    if( files.name.endsWith('.groovy') ) {
        println files.name
    }
}
