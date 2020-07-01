package com.example.practica4equipo1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_area_hexagono.*
import java.math.RoundingMode
import kotlin.math.pow
import kotlin.math.tan


class AreaHexagonoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_area_hexagono, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_AreaHexagonoFragment_to_SecondFragment)
        }*/

        bt_calcular.setOnClickListener {

            val lado = etn_lado.text.toString()

            if (lado.isEmpty() || lado.isBlank()) {
                Toast.makeText(activity, "Ingrese in valor", Toast.LENGTH_SHORT).show()
            } else {
                var aux = lado.toDouble()
                aux = (3 * (aux.pow(2.0))) / (2 * tan((Math.PI) / 6))
                tv_resultado.text =
                    "${aux.toBigDecimal().setScale(4, RoundingMode.HALF_EVEN).toPlainString()} cm²"
            }
        }

    }
}