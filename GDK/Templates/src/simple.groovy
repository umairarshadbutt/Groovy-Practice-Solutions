import groovy.text.SimpleTemplateEngine
import groovy.text.Template

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template= engine.createTemplate(new File('dynamic_email.txt'))


Map bindings=[
        firstName:"Umair",
        lastName:"Arshad",
        repositories:[
                [name: 'Appachi Groovy', url:'httpx://example.com/example.html'],
                [name: 'Appachi Groovy 2', url:'httpx://example.com/example.html']

        ]
]

println template.make(bindings)
