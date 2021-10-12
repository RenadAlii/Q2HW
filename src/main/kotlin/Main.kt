fun main(args: Array<String>) {


        print("Enter your annual salary :")
        var salary = readLine()!!.toDouble()
        print("\n Enter 1 for excellent performance, 2 for good performance, 3 for poor performance ")

        var raise:Double=0.0
        var con:Boolean=true

        while(con) {
            var p= readLine()
            if (p == "1") {
                raise = (salary * 0.06) + salary
                con = false
            } else if (p == "2") {
                raise = (salary * 0.04) + salary
                con = false
            } else if (p == "3") {
                raise = (salary * 0.015) + salary
                con = false

            } else {
                println("I told you to Choose number from 1 to 3!!!!\n try Again")
                print("\n Enter 1 for excellent performance, 2 for good performance, 3 for poor performance ")
                continue

            }

        }
        println("the raise is: "+raise)


    }