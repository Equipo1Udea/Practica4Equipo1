package com.example.practica4equipo1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
import kotlinx.android.synthetic.main.fragment_perimetro_cuadrado.*
import java.math.RoundingMode

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/*
 * A simple [Fragment] subclass.
 * Use the [PerimetroCuadrado.newInstance] factory method to
 * create an instance of this fragment.
 */
class PerimetroCuadradoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perimetro_cuadrado, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_perimetro_cuadrado.setOnClickListener {
            val ladoCuadrado = et_perimetro_cuadrado.text.toString()

            if (ladoCuadrado.isEmpty()) {
                tv_final_perimetro_cuadrado.text = "No ha ingresado valor!"
            } else {
                val ladoA =
                    (4 * ladoCuadrado.toDouble()).toBigDecimal().setScale(2, RoundingMode.HALF_UP)
                        .toString()

                tv_final_perimetro_cuadrado.text = "El perímetro del cuadrado es: $ladoA"
            }
        }
    }
}