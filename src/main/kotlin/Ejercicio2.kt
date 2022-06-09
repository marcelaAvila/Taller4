fun main() {

    var altura = 0
    var lista: MutableList<Int> = mutableListOf()
    while (altura<3){
        print("Ingrese la altura ")
        altura = readLine()!!.toInt()
        lista.add(altura)
    }
    print("Ingrese un numero ")
    var n = readLine()!!.toInt()

    print("El promedio de la altura es ${promedioAltura(lista)}")
    print("La cantidad de altura por debajo del promedio es ${metrosMenor(lista,n)}")

}

fun metrosMenor(listAltura:MutableList<Int>, n:Int):Int{
    var num = 0
    repeat(listAltura.size){
        if (listAltura[it]<n){
            num++
        }
    }
    return num
}

fun promedioAltura(listAltura:MutableList<Int>):Double{
    var suma = 0.0
    repeat(listAltura.size){
        suma+=listAltura[it]
    }
    var promedio = suma/listAltura.size
    return promedio
}