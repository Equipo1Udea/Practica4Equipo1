package com.example.practica4equipo1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
import kotlinx.android.synthetic.main.fragment_perimetro_circulo.*

class PerimetroCirculoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_perimetro_circulo, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        BT_KC_Calcular.setOnClickListener {
            val datoprincipal = ET_KC_ValorDecimal.text.toString()

            if (datoprincipal.isEmpty()) {
                Toast.makeText(activity, "Por favor, ingrese un valor.", Toast.LENGTH_SHORT).show()
            } else {
                if (RB_KC_Radio.isChecked) {
                    val kcradio = ET_KC_ValorDecimal.text.toString().toDouble()
                    val kcresultado = 2 * 3.14159265359 * kcradio
                    TV_KC_Resultado.text =
                        " Para un radio de $kcradio unidades de longitud, el perímetro del circulo es $kcresultado"
                } else {
                    if (RB_KC_Diametro.isChecked) {
                        val kcdiametro = ET_KC_ValorDecimal.text.toString().toDouble()
                        val kcresultado = 3.14159265359 * kcdiametro
                        TV_KC_Resultado.text =
                            " Para un díametro de $kcdiametro unidades de longitud, el perímetro del circulo es $kcresultado"
                    } else {
                        TV_KC_Resultado.text = " Por favor, seleccione uno de los datos a ingresar"
                    }
                }
            }

        }


    }
}