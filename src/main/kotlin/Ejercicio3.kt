fun main(){

    var num:Int
    print("Cuantas palabras desea ingresar ")
    num = readLine()!!.toInt()
    var lista:MutableList<String> = mutableListOf()
    repeat(num){
        print("Ingrese una palabra ")
        var palabras = readLine()!!
        lista.add(palabras)
    }

    print("La cantidad de verbos son ${verbos(lista)}")

}

fun verbos(list:MutableList<String>):Int{
    var cont = 0
    for(palabra in list){
        if(palabra.endsWith("ar")||palabra.endsWith("er")||palabra.endsWith("ir")){
            cont++
        }
    }
    return cont
}