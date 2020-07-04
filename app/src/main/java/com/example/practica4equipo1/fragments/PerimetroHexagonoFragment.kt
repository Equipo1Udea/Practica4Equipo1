package com.example.practica4equipo1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
import kotlinx.android.synthetic.main.fragment_perimetro_hexagono.*
import java.math.RoundingMode

class PerimetroHexagonoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perimetro_hexagono, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_perimetro_hexagono.setOnClickListener {
            val Lado_hexagono = et_perimetro_hexagono.text.toString()

            if (Lado_hexagono.isEmpty()) {
                Toast.makeText(activity, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            } else {
                val resultado =
                    (6 * Lado_hexagono.toDouble()).toBigDecimal().setScale(3, RoundingMode.HALF_UP)
                        .toString()
                tv_final_hexagono.text = resultado
            }
        }
    }
}