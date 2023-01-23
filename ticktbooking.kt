import java.time.LocalDate
import java.time.LocalTime
import java.util.Scanner

class Ticket {
    var from:String = ""
    var to:String = ""
    var cost:Int = 100
    var seatNo:Int = 0
    var date = LocalDate.now()
    var time = LocalTime.now()

    inner class Customer{
        var name:String = ""
        var age:Int = 0
    }
    inner class Booking{
        val customerObj = Customer()
        fun customerDetails() {
            println("Enter Booking Details: ")
            print("Name: ")
            customerObj.name = readln()
            print("Age: ")
            customerObj.age = Integer.valueOf(readln())
            print("From: ")
            from = readln()
            print("To: ")
            to = readln()

            seatNo = kotlin.random.Random.nextInt(1,100)
            date = LocalDate.now()
            time = LocalTime.now()
            println("Tickets Booked")
        }
        fun display() {
            println("\nTicket Details:")
            println("Name: ${customerObj.name}")
            println("Age: ${customerObj.age}")
            println("From: $from")
            println("To: $to")
            println("Date: $date")
            println("Time: $time")
            println("Cost: $cost")
            println("Seat No: $seatNo")
        }
    }
}

fun main() {
    val ticketObj = Ticket().Booking()
    ticketObj.customerDetails()
    ticketObj.display()
}

/*
Day18 Task 2
create class ticket
    from
    to
    date
    time
    cost
    seatNo
customer class
    name
    age
booking class
    customer details
    CUSTOMER LIST
            booking details
    show the particular booking details
 */