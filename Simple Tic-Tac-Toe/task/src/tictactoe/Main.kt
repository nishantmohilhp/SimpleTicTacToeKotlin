package tictactoe

val dp = print("Enter cells: ")
var isWin = false
var input = readln()
var xWin = false
var oWin = false
var isDrow = false
var imposible = false
fun main() {
    println("---------")
    println("| ${input[0]} ${input[1]} ${input[2]} |")
    println("| ${input[3]} ${input[4]} ${input[5]} |")
    println("| ${input[6]} ${input[7]} ${input[8]} |")
    println("---------")
    winCheck()
    if (input.contains('_')&& !isWin) println("Game not finished")
    else if (!isWin&& !(input.contains('_'))) println("Draw")
    else if (xWin&& oWin){
        println("Impossible")
        isDrow =true
    }
}

fun winCheck() {
    val hwP = mutableListOf(0, 3, 6)
    val vwP = mutableListOf(0, 1, 2)
    for (i in hwP) hvWin(input[i], input[i + 1], input[i + 2])
    for (i in vwP) hvWin(input[i], input[i + 3], input[i + 6])
    hvWin(input[0], input[4], input[8])
    hvWin(input[6], input[4], input[2])
}

fun hvWin(p1: Char, p2: Char, p3: Char) {
    if (p1 == p2 && p2 == p3) {
        isWin = true
    }
    if (isWin&&(p2=='X'|| p2 =='x')) {
        xWin = true
    }
    if (isWin&&(p2=='O'|| p2 =='o')) {
        oWin = true
    }
}

