package com.example.practica4equipo1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
import kotlinx.android.synthetic.main.fragment_perimetro__hexagono_.*

class Perimetro_Hexagono_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perimetro__hexagono_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_Calcular.setOnClickListener {
            var Lado = et_Lado.text.toString().toInt()

            bt_Calcular.setOnClickListener {
                Lado = Lado * 6
                tv_Resultado.text = Lado.toString()


            }
        }

    }
}