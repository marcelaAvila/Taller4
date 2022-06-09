fun main() {
    var lista:MutableList<Int> = mutableListOf()

   var edad = 0
    while(edad>-1){
        print("Ingrese la edad " )
        edad = readLine()!!.toInt()
        lista.add(edad)
    }

    var (siglo_pasado, promedio) = siglo(lista)
    println("Hay $siglo_pasado estudiantes del siglo pasado")
    println("El promedio de edad es de $promedio")
}

fun siglo(list:MutableList<Int>):Pair<Int,Double>{
    var siglo_pasado=0
    var suma=0.0
    repeat(list.size){
        if(list[it]>22){
            siglo_pasado++
        }
        suma+=list[it]
    }

    /*for (edad in list){
        if(edad>=22){
            siglo_pasado++
        }

        suma+=edad
    }
*/
    var promedio=suma/list.size
    return siglo_pasado to promedio
}