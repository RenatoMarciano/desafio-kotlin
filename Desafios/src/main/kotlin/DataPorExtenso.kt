fun main() {

    println("Digite o mes: ");
    val entrada: String? = readLine();

    val (dia, mes, ano) = entrada!!.split("/")

    val mesPorExtenso = when (mes.toInt()) {
        1 -> {
            if (dia.length.equals(1)){
                println("0"+dia + " de Janeiro de " + ano)
            } else{
                println(dia + " de Janeiro de " + ano)
            }
        }
        2 -> {
            if (dia.length.equals(1)){
                println("0"+dia + " de Fevereiro de " + ano)
            } else{
                println(dia + " de Fevereiro de " + ano)
            }
        }
        3 -> {
            if (dia.length.equals(1)){
                println("0"+dia + " de Março de " + ano)
            } else{
                println(dia + " de Março de " + ano)
            }
        }
        4 -> {
            if (dia.length.equals(1)){
                println("0$dia de Abril de $ano")
            } else{
                println("$dia de Abril de $ano")
            }
        }
        5 -> {
            if (dia.length.equals(1)){
                println("0$dia de Maio de $ano")
            } else{
                println("$dia de Maio de $ano")
            }
        }
        6 -> {
            if (dia.length.equals(1)){
                println("0$dia de Junho de $ano")
            } else{
                println("$dia de Junho de $ano")
            }
        }
        7 -> {
            if (dia.length.equals(1)){
                println("0$dia de Julho de $ano")
            } else{
                println("$dia de Julho de $ano")
            }
        }
        8 -> {
            if (dia.length.equals(1)){
                println("0$dia de Agosto de $ano")
            } else{
                println("$dia de Agosto de $ano")
            }
        }
        9 -> {
            if (dia.length.equals(1)){
                println("0$dia de Setembro de $ano")
            } else{
                println("$dia de Setembro de $ano")
            }
        }
        10 -> {
            if (dia.length.equals(1)){
                println("0$dia de Outubro de $ano")
            } else{
                println("$dia de Outubro de $ano")
            }
        }
        11 -> {
            if (dia.length.equals(1)){
                println("0$dia de Novembro de $ano")
            } else{
                println("$dia de Novembro de $ano")
            }
        }
        12 -> {
            if (dia.length.equals(1)){
                println("0$dia de Dezembro de $ano")
            } else{
                println("$dia de Dezembro de $ano")
            }
        }

        else -> {
            "Mês Inválido!"
        }
    }
}