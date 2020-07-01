package com.example.practica4equipo1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        var Lado = et_Lado.toString().toInt()

        bt_Calcular.setOnClickListener {
            tv_Resultado.text = (Lado * 6).toInt().toString()

            
        }

    }
}