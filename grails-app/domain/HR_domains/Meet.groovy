package HR_domains

import groovy.transform.ToString

@ToString
class Meet {
    long id
    String target
    Date data
    TypeMeet typemeet
    Evalution evalution
    static belongsTo = [employee : Employee]
    static constraints = {
        target(nullable:true)
        data(nullable:true)
        typemeet(nullable:true)
        evalution(nullable:true)
    }
    static mapping = {
        id generator: 'increment'
        evalution enumType: 'string'
        typemeet enumType: 'string'
    }
}
