package com.example.lib

/*
 * 1,2,3,4,5,6,7 escribir un programa que escriba
 * los dias de la semana y si es sabado o domingo es fin de semana
 */
fun main(){
    val DayOfWeek = 7
//    ctrl k ctrl c / ctrl k ctrl u
    when(DayOfWeek){
        1 -> println("Es lunes")
        2 ->{ println("Es martes ")
             println("Haciendo mas cositas")
        }
        3 -> print("Es miercoles")
        4 -> print("Es jueves")
        5 -> print("Es viernes")
        6,7 -> print("Es fin de semana")
       else -> println()
    }
}
