package com.example.practica4equipo1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
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

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_area_hexagono.setOnClickListener {

            val lado = et_area_hexagono.text.toString()

            if (lado.isEmpty() || lado.isBlank()) {
                Toast.makeText(activity, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            } else {
                var aux = lado.toDouble()
                aux = (3 * (aux.pow(2.0))) / (2 * tan((Math.PI) / 6))
                tv_resultado_hexagono.text =
                    "${aux.toBigDecimal().setScale(4, RoundingMode.HALF_EVEN)
                        .toPlainString()} Unidades cuadráticas"
            }
        }

    }
}