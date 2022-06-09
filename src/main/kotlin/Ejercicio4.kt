fun main(){

    var listEstudiantes:MutableList<Double> = mutableListOf()
    print("Escriba la cantidad de estudiantes a ingresar")
    var cantidadEstudiantes = readLine()!!.toInt()
    while (cantidadEstudiantes >0){
        print("Escriba una nota ")
        var notas = readLine()!!.toDouble()
        listEstudiantes.add(notas)
    }

    var (perdidos, promedio) = estudiantesPromedio(listEstudiantes)
    print("La cantidad de estudiantes que ganaron el curso ${listEstudiantes.size-perdidos}")
    print("La cantidad de estudiantes que perdieron el curso ${perdidos}")
    print("El promedio de notas es de $promedio")

}

fun estudiantesPromedio(estudiantesList:MutableList<Double>):Pair<Int,Double>{
    var suma = 0.0
    var perdidos = 0
    for (notas in estudiantesList){
        if (notas<=3){
            perdidos++
        }
        suma+=notas
    }

    var promedio = suma/estudiantesList.size
    return (perdidos to promedio)
}