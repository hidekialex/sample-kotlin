package meuprimeiroapp.studio.com.aposentadoria

class Aposentadoria {

    fun calcular(sexo : String, idade: Int) : String {

        var resultado = 0
        if(sexo == "Masculino") {
            resultado = 65 - idade
        } else {
            resultado = 60 - idade
        }
        return "Falta $resultado para se aposentar"
    }
}