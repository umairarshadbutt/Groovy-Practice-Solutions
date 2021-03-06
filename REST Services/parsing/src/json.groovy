import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    currentBook {
        title 'The 4 Hour Work Week'
        isbn '978-0-307-46535-1'
        author( first:'Umair', last:'Arshad', facebook:'umairarshadbutt')
        related 'The 4 Hour Body', 'The 4 hour chef'
    }

    nextBook {
        title '#AskGaryVee'
        isbn '978-0-06-227312-3'
        author( first:'Umair', last:'Arshad', facebook:'umairarshadbutt')
        related 'Jab, Jab, Jab, Right Hook', 'Crush It!'
    }

}

new File('data/books.json').write(builder.toPrettyString())
