 
listView('Groovy88 Jobs') {
    description('Groovy88 Jobs')
    jobs {
        regex('Groovy88_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
