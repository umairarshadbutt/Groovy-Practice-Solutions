package com.umair

class POGO {
    String property

    void setProperty (String name, Object value){
        this.@"$name" = 'overridden'
    }
}

def pogo = new POGO()
pogo.property = 'a'
assert pogo.property =='overridden'
