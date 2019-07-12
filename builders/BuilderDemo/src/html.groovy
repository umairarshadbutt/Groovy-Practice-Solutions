import groovy.xml.MarkupBuilder

FileWriter writer=new FileWriter('html/about.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
        [id:1, name: 'Appahe Groovy'],
        [id:2, name: 'Java Programming']
]

builder.html{
    head{
        title 'Umair Arshad'
        description 'This is an about me page'
        keywords 'Umair Arshad, Groovy, Java, angular, Typescript'
    }

    body{
        h1 'About me'
        p 'This is a bunch of text abot me...'
        section {
            h2 'Courses'
            table{
                tr{
                    th 'id'
                    th 'name'
                }
                courses.each { course->
                    tr{
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
}
