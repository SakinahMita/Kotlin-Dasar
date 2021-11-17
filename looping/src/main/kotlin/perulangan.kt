fun main(){
    for (index in 1..5 step 2){
        println("nilai $index")
    }

    val myArray = arrayOf(1,2,3,4,5,6,7,8,9)
    println(myArray.toList())

    // cetak nilai array brdasarkan ganjil genapnya
    for (i in myArray){
        if (i %2 == 0){
            println("$i Genap")
        }else {
        println("$i Ganjil")
    }
        }

    //looping with while
    var temp = 0
    while (temp <= 10){
        println("bilangan ke-$temp")
        temp++
    }

    //looping with do while
    var stoper = 1
    do {
        println("bilangan $stoper")
        stoper++
    }while (stoper <  5)

    // continue
    val myNumber = arrayOf(1,2,3,4,5)
    for (i in myNumber){
        if (i %1 == 0){
            println("skip ads")
            break
        }
        println(i)

    }
}
