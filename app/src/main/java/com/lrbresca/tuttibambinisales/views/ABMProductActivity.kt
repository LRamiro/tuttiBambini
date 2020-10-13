package com.lrbresca.tuttibambinisales.views

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.lrbresca.tuttibambinisales.R
import com.lrbresca.tuttibambinisales.databinding.ActivityAbmProductBinding
import com.lrbresca.tuttibambinisales.views.abmProduct.CreateProductFragment

class ABMProductActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAbmProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayFragment()
    }

    private fun displayFragment(){
        val createProductFragment = CreateProductFragment()
        // Get the FragmentManager and start a transaction. Using getSupportFragmentManager()
        //instead of getFragmentManager, allowing the app being compatible with devices running
        //system version as los as Android 1.6
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction();
        //Add the SimpleFragment
        fragmentTransaction.add(R.id.fragment_container, createProductFragment)
            //The addToBackToStack is to add the transcation to a back stack of fragments
            // transactions, allowing the user to return to the preovious fragment state by
            //pressing the back button.
            .addToBackStack(null).commit()

    }

}