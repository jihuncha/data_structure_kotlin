package com.huni.grammer.joyce.expert

//data Class

data class Ticket(val companyName: String, val name: String, var date : String, var seatNumber : Int)
//toString(), hashCode(), equals(), copy() 다 만들어줌


//일반 클래스
class TicketNormal(val companyName: String, val name: String, var date : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("KoreanAir", "jihunCha", "2020-02-10", 14)
//    println(ticketA.date)
    val ticketB = TicketNormal("KoreanAir", "jihunCha", "2020-02-10", 14)

    //data의 경우 tostring, b는 주소값이 나옴
//    Ticket(companyName=KoreanAir, name=jihunCha, date=2020-02-10, seatNumber=14)
//    com.huni.grammer.joyce.expert.TicketNormal@2a84aee7
    println(ticketA)
    println(ticketB)

}


