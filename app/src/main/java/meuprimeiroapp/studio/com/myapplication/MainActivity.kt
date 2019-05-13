package meuprimeiroapp.studio.com.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.*
import meuprimeiroapp.studio.com.aposentadoria.Aposentadoria

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Para recuperar o objeto Spinner
        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)

        // Para colocar valores dentro do Spinner
        var listaSexos = listOf("Masculino", "Feminino")
        spn_sexo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaSexos)

        // para recuperar o objeto EditText da idade
        val txt_idade = findViewById<EditText>(R.id.txt_idade)

        // para recuperar o objeto TextView do resulta (que eh invisivel quando inicializa o app)
        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)

        // para recuperar o objeto do botao
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        // para dar acao ao evento do click no botao
        btn_calcular.setOnClickListener {

            // pra pegar a idade do EditText ja convertendo pra Int
            val idade = txt_idade.text.toString().toInt()

            // pra pegar do Spinner o valor ja convertendo pra String
            val sexo = spn_sexo.selectedItem as String

            //instancia um objeto do tipo Aposentadoria
            var aposentadoria = Aposentadoria()

            // chama a funcao calcular passando sexo e idade
            var resultado = aposentadoria.calcular(sexo, idade)

            // seta a mensagem no TextView invisivel
            txt_resultado.text = resultado
        }
    }
}
