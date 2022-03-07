package com.tuwaiq.testing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class CalculatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    fun plus(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun multiplied(n1:Int,n2:Int):Int{
        return n1*n2
    }

    fun divided(n1: Int,n2: Int):Int{
        return n1/n2
    }

    fun subtract(n1: Int, n2: Int):Int{
        return n1-n2
    }

}