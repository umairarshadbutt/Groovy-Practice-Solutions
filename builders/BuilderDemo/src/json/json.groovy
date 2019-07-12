import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books{

    book{
        title 'The 4 hour work week'
        isbn '4856-5848-5478-4848'
        author ( first:'Umair', last:'Arshad',facebook:'umairarshadbutt')
        related 'The 4 body', 'The 4 chef'
    }
}


println builder.toString()
