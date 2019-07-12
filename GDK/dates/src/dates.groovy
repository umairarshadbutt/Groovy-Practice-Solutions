//creat new date

Date today = new Date()
println today

println "============================"

Date bday = new Date("11/11/1993")
println bday

println bday.format('M-D-Y')
println "============================"


//add & subtract

Date oneWeekFromToday = today + 7//today.plus(7)
Date oneWeekAgo = today - 7//today.minus(7)
println oneWeekFromToday
println oneWeekAgo
println "============================"

oneWeekFromToday.downto(today) {
    println it
}
println "============================"


Range twoWeeks = oneWeekAgo..oneWeekFromToday
twoWeeks.each {
    println it
}
println "============================"


