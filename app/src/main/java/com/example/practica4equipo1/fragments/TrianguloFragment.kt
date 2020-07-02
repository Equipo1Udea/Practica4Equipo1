package com.example.practica4equipo1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
import kotlinx.android.synthetic.main.fragment_triangulo.*


/*
 * A simple [Fragment] subclass.
 * Use the [TrianguloFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TrianguloFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_triangulo, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_area_triangulo.setOnClickListener {
            val altura = et_altura.text.toString()
            val base = et_base.text.toString()

            if (base.isEmpty() || altura.isEmpty()) {
                tv_final_area_triangulo.text = "incorrecto"
            } else {
                val resultado = (altura.toDouble() * base.toDouble()) / 2
                tv_final_area_triangulo.text = "\n El área del triángulo es: $resultado"
            }
        }

    }
}
