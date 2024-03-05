package lazarini.lucas.cadastro

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import lazarini.lucas.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(activityMainBinding.getRoot())

        activityMainBinding.salvarBt.setOnClickListener {
            val formulario = Formulario(
                activityMainBinding.nomeEt.text.toString(),
                activityMainBinding.telefoneEt.text.toString(),
                activityMainBinding.emailEt.text.toString(),
                activityMainBinding.mailListCb.isChecked,
                if (activityMainBinding.sexoRadMasc.isChecked)
                    "Masculino"
                else
                    "Feminino",
                activityMainBinding.cidadeEt.text.toString(),
                activityMainBinding.ufSp.selectedItem.toString()
            )

            formulario.toString().also {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }

        activityMainBinding.limparBt.setOnClickListener {
            activityMainBinding.nomeEt.setText("")
            activityMainBinding.telefoneEt.setText("")
            activityMainBinding.emailEt.setText("")
            activityMainBinding.mailListCb.isChecked = false
            activityMainBinding.sexoRadMasc.isChecked = true
            activityMainBinding.cidadeEt.setText("")
            activityMainBinding.ufSp.setSelection(0)
        }
    }
}