package HR_domains

class ApprovedTechnologies {
    Long id
    String technologies
    static belongsTo = [task : Task]
    static constraints = {
        technologies(nullable:true)
    }
    static mapping = {
        id generator: 'increment'
    }
}
