package io.hydok.mvipattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.orbitmvi.orbit.viewmodel.observe

class MainActivity : AppCompatActivity() {

    private val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel.observe(lifecycleOwner = this, state = ::render, sideEffect = ::handleSideEffect)
    }


    private fun render(state: CalculatorState) {
        //ui update
    }

    private fun handleSideEffect(sideEffect: CalculatorSideEffect) {
        when (sideEffect) {
            is CalculatorSideEffect.Toast -> Toast.makeText(
                this@MainActivity,
                sideEffect.text,
                Toast.LENGTH_SHORT
            ).show()

            //add
        }
    }
}