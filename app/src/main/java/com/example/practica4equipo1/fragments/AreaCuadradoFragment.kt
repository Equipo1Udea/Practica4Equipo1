package com.example.practica4equipo1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practica4equipo1.R
import kotlinx.android.synthetic.main.fragment_area_cuadrado.*
import java.math.RoundingMode

/*
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class AreaCuadradoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_area_cuadrado, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.bt_area_cuadrado).setOnClickListener {
            val text = et_area_cuadrado.text.toString()

            if (text.isEmpty()) {
                Toast.makeText(activity, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            } else {
                val lado = text.toDouble()
                var show = (lado * lado).toBigDecimal().setScale(3, RoundingMode.HALF_UP).toString()
                if (show.last() == '0') {
                    show = show.removeRange(show.length - 1, show.length)
                    if (show.last() == '0') {
                        show = show.removeRange(show.length - 1, show.length)
                        if (show.last() == '0') {
                            show = show.removeRange(show.length - 2, show.length)
                        }
                    }
                }
                tv_final_area_cuadrado.text = "$show unidades cuadráticas"
            }
        }
    }

}