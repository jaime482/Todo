package utng.edu.conjunto

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_viaje.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJuego.setOnClickListener {
            startActivity(Intent(this,JuegoActivity::class.java))
        }

        btnViaje.setOnClickListener {
            startActivity(Intent(this, ViajeActivity::class.java))
        }

        btnPrestamo.setOnClickListener {
            startActivity(Intent(this, PrestamoActivity::class.java))
        }

        btnSalir.setOnClickListener {

            System.exit(0)

        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        var mensaje: String=""
        when (item.itemId) {
            R.id.itmPrestamo -> {
                mensaje= "Has seleccionado Prestamo"
                startActivity(Intent(this, PrestamoActivity::class.java))
            }
            R.id.itmViaje -> {
                mensaje= "Has seleccionado Viaje"
                startActivity(Intent(this, ViajeActivity::class.java))

            }
            R.id.itmJuego -> {
                mensaje= "Has seleccionado Juego"
                startActivity(Intent(this, JuegoActivity::class.java))

            }
            R.id.itmSalir -> {
                System.exit(0)
            }

        }
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        return  super.onOptionsItemSelected(item)
    }





}
