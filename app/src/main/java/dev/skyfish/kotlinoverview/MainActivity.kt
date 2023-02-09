package dev.skyfish.kotlinoverview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import dev.skyfish.kotlinoverview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //////////////////////////////////////////////////////////////////

        var users = mutableListOf(
            UserAccount("tim05","pass123",true),
            UserAccount("redsoxfav25","pas\$word"),
            TrialUserAccount("trialUser","pass123",),
            UserAccount("Jim12","strongPass2345@",true)
        )

        users.add(UserAccount("phil4_32","password12!@",true))

        var currentIndex = 0

        binding.button.setOnClickListener {
            val current = users[currentIndex]
            binding.tvUsername.text = current.username
            binding.tvPassword.text = current.password
            binding.tvActive.text = if(current.subActive) "Active" else "Not Active"
            if(currentIndex == users.size - 1) {
                currentIndex = 0
            } else {
                currentIndex++
            }
        }


    }


}