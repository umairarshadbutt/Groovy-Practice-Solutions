String dir = '/home/azaidi/git/groovy/GDK/files-groovy'

//List hidden =[]
//new File(dir).eachFile {file ->
//        if (file.isDirectory()){
//                println file.name
//        }
//
//        if (file.isHidden()){
//                hidden<<file.name
//        }
//}
//
//println hidden
//
//new File(dir).eachDir {subFolder ->
//        println subFolder
//}

def sDir = new File('/home/azaidi/git/groovy/GDK/files-groovy')

println sDir.directorySize()

 //create a new directory
 new File('dummy').mkdir()


 new File('one/two/three').mkdirs()


new File('dummy').deleteDir()
