import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes
builder.omitNullAttributes

builder.sports{
    sport(id:1){
        name 'Baseball'
    }

    sport(id:2){
        name 'Football'
    }

    sport(id:3){
        name 'Hockey'
    }

    sport(id:4){
        name 'Cricket'
    }

    sport(id:null,foo:''){
        name ''
    }
}
