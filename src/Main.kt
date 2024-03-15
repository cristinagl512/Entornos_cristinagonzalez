import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var matriz = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = sumarFilas(matriz)
    var sumaColum = Array(matriz[0].size){0}


    for (f in matriz.indices){
        for (c in matriz[f].indices){
            print("${matriz[f][c]} ")
        }
        println()
    }
    var filas: Int = 0
    var columnas: Int = 0

    while (filas < matriz.size){
        while (columnas < matriz[0].size){
            sumaFilas[filas] += matriz[filas][columnas]
            columnas++
        }
        columnas = 0
        filas++
    }

    sumaColumnas(matriz,sumaColum)
    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColum))


}

private fun sumarFilas(m: Array<Array<Int>>): Array<Int> {
    var sumaFilas = Array(m.size) { 0 }
    return sumaFilas
}


fun sumaColumnas (m:Array<Array<Int>>, sumaColumnas:Array<Int>){
    var f: Int = 0
    var c: Int = 0

    while (c < m.size){
        while (f < m[0].size){
            sumaColumnas[c] += m[f][c]
            f++
        }
        f = 0
        c++
    }
fun pruebaGit(): Int{
    var x = 1
    var y = 1
    return resultado = x + y
}
}


