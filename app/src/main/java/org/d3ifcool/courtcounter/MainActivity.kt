package org.d3ifcool.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.d3ifcool.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var countA = 0
    private var countB = 0
    private var count2A=0
    private var count3A=0
    private var count2B=0
    private var count3B=0


    //private lateinit var binding: ActivityMainBinding
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            on3pointAclick()
            binding.textView4.text=countA.toString()
        }
        binding.button4.setOnClickListener {
            on3pointBclick()
            binding.textView5.text=countB.toString()
        }
        binding.button2.setOnClickListener {
            count2A+=2
            binding.textView4.text=countA.toString()
        }
        binding.button7.setOnClickListener {
            textView4.setText("")
            textView5.setText("")
        }


        if (savedInstanceState!=null){
            countA=savedInstanceState.getInt("hasilA",0)
            countB=savedInstanceState.getInt("hasilB",0)

        }
        //binding.countA = countA

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("hasilA",countA)
        outState.putInt("hasilB",countB)
        super.onSaveInstanceState(outState)
    }
    private fun on3pointAclick(){
        countA+=3
    }
    private fun on3pointBclick(){
        countB+=3
    }


}
