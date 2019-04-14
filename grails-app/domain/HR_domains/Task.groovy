
package HR_domains

import groovy.transform.ToString

@ToString()
class Task {
    long id
    String name
    Date limitation
    String performancefeatures
    Evalution evalution
    static belongsTo = [employee : Employee]
    static hasMany = [approvedtechnologies : ApprovedTechnologies]
    static constraints = {
        limitation(nullable:true)
        performancefeatures(nullable:true)
        evalution(nullable:true)
    }
    static mapping = {
        id generator: 'increment'
        evalution enumType: 'string'
    }
}
