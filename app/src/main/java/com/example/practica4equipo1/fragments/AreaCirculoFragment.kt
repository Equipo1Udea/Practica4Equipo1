package com.example.practica4equipo1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
import kotlinx.android.synthetic.main.fragment_area_circulo.*

/*
 * A simple [Fragment] subclass.
 * Use the [AreaCirculoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AreaCirculoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_area_circulo, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_calcular.setOnClickListener {
            val value = et_valor.text.toString()
            if (value.isEmpty()) {
                Toast.makeText(activity, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            } else {
                if (rb_radio.isChecked) {
                    val radio = et_valor.text.toString().toDouble()
                    val result = radio * radio * 3.14159
                    val resultS = String.format("%.2f", result)
                    tv_resultado.text =
                        "Para un radio de $radio unidades longitudinales se trendrá una área aproximada de $resultS unidades cuadradas"
                } else {
                    val diametro = et_valor.text.toString().toDouble()
                    val result = (diametro / 2) * (diametro / 2) * 3.14159
                    val resultS = String.format("%.2f", result)
                    tv_resultado.text =
                        "Para un diámetro de $diametro unidades longitudinales se trendrá una área aproximada de $resultS unidades cuadradas"
                }
            }
        }
    }


}