package dev.skyfish.kotlinoverview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //////////////////////////////////////////////////////////////////

        var users = mutableListOf(
            UserAccount("tim05","pass123",true),
            UserAccount("redsoxfav25","pas\$word"),
            TrialUserAccount("trialUser","pass123",),
            UserAccount("Jim12","strongPass2345@",true)
        )


    }


}