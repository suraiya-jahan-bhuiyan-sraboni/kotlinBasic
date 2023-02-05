fun main(){
    var number=1234567890
    var newNumber= number.toString()

    val evenDigitList=mutableListOf<Int>()
    val oddDigitList=mutableListOf<Int>()
    for(n in newNumber){
        if(n.toString().toInt()%2==0){
            evenDigitList.add(n.toString().toInt())
        }else{
            oddDigitList.add(n.toString().toInt())
        }
    }
    println("Even digit list"+evenDigitList)
    println("Odd digit list"+oddDigitList)
}
