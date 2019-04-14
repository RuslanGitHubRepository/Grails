package HR_domains

import groovy.transform.ToString

@ToString
class Passport {
    long id
    Date dateissue
    String placeissue
    Integer series
    Integer number
    String unitcode
    static belongsTo = [employee:Employee]
    static constraints = {
        unitcode(nullable:true)
        dateissue(nullable:true)
        placeissue(nullable:true)
        series(nullable:true)
        number(nullable:true)
        employee(nullable:true)
    }
    static mapping = {
        id generator: 'increment'
    }
}
