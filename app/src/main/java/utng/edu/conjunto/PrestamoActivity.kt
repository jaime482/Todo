package utng.edu.conjunto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prestamo.*


class PrestamoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestamo)
        btnRegresar.setOnClickListener {
            finish()
        }

        btnCalcular.setOnClickListener {
            var cadena: String=etxMonto.text.toString()
            var monto: Double =cadena.toDouble()
            var plazo: Double =etxPlazo.text.toString().toDouble()
            var interes: Double =etxInteres.text.toString().toDouble()


            interes=interes/100

            var i=interes/12

            var superior=Math.pow((1+i),plazo)*i

            var inferior=Math.pow((1+i),plazo)-1

            var pagoMensual=monto*(superior/inferior)


            txvResultado1.text="Monto= ${monto.toString()} \n" +
                    "Interes= ${interes.toString()} \n"+
                    "Pago Mensual= ${pagoMensual.toString()}"
        }




    }




    }

