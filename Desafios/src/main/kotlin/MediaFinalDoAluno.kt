fun main() {

    println("Digite uma linha de notas: ");
    val medias = readLine()!!.toDouble();

    //print(medias);

    when {
        medias < 5 -> println("REP");
        medias >= 5 && medias < 7 -> println("REC");
        else -> println("APR");

    }
}