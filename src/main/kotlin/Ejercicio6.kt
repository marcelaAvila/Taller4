fun main() {
    var lista: MutableList<Pair<String, Int>> = mutableListOf()
    print("Cuantos estudiantes va a ingresar: ")
    var cant = readLine()!!.toInt()
    repeat(cant) {
        print("Escriba el nombre: ")
        var nombre = readLine()!!
        print("Escriba el año: ")
        var edad = readLine()!!.toInt()
        lista.add(it, Pair(nombre, edad))
    }

    print(fechaNacimiento(lista))
}

fun fechaNacimiento(lista:MutableList<Pair<String,Int>>):String{
    var nombre = ""
    var mayor = lista[0].second
    for (i in lista){
        if (i.second<=mayor){
            mayor = i.second
            nombre = i.first
        }
    }
    return nombre
}