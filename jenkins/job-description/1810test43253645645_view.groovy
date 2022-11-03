 
listView('1810test43253645645 Jobs') {
    description('1810test43253645645 Jobs')
    jobs {
        regex('1810test43253645645_.+')
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
