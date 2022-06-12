fun main() {
    var lista: MutableList<Triple<String, Double, Double>> = mutableListOf()
    print("¿Cuantos triangulo desea ingresar?: ")
    var cantidad = readLine()!!.toInt()
    repeat(cantidad){
        print("Escriba el nombre del triangulo: ")
        var nombre = readLine()!!
        print("Escriba la base del triangulo: ")
        var base = readLine()!!.toDouble()
        print("Escriba la altura del triangulo: ")
        var altura = readLine()!!.toDouble()
        lista.add(Triple(nombre,base,altura))
    }
    print("Escriba el nombre de un triangulo: ")
    var nombre = readLine()!!

    println("El nombre del triangulo con mayor area es: ${mayorArea(lista)}")
    println("El area del triangulo con el nombre $nombre es de: ${triangulo(lista, nombre)}")

}

fun areaTriangulo(base:Double, altura:Double)=(base*altura)/2

fun mayorArea(lista:MutableList<Triple<String,Double,Double>>):String{
    var mayor = 0.0
    var nombre = ""
    for (i in lista){
        var area = areaTriangulo(i.second, i.third)
        if (area>mayor){
            mayor=area
            nombre = i.first
        }
    }
    return nombre
}

fun triangulo(lista: MutableList<Triple<String, Double, Double>>, nombre:String):Double{
    var area = -1.0
    for (i in lista){
        if (nombre.equals(i.first)){
            area = areaTriangulo(i.second,i.third)
        }
    }
    return area
}