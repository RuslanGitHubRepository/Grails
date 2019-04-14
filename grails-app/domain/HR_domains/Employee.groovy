package HR_domains

import com.fasterxml.jackson.annotation.JsonIgnore
import groovy.transform.ToString
import javax.persistence.Transient

class Employee {
    Long id
    String name
    String surname
    String patronymic
    Date birthday
    boolean isdocumented
    Passport passport
    static hasMany = [ meets : Meet, tasks : Task]
    static mapping = {
        meets lazy:true
        tasks lazy:true
        id generator: 'increment'
    }
    static constraints = {
        birthday(nullable:true)
        isdocumented(nullable:true)
        passport(nullable:true)
    }
}
