package dev.skyfish.kotlinoverview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dev.skyfish.kotlinoverview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logState("onCreate()")
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

    override fun onStart(){
        super.onStart()
        logState("onStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle){
        super.onRestoreInstanceState(savedInstanceState)
        logState("onRestoreInstanceState(..)")

        val username = savedInstanceState.getCharSequence("username")
        val password = savedInstanceState.getCharSequence("password")
        val active = savedInstanceState.getCharSequence("active")
        binding.tvUsername.text = username
        binding.tvPassword.text = password
        binding.tvActive.text = active
        currentIndex = savedInstanceState.getInt("index")
    }

    override fun onResume(){
        super.onResume()
        logState("onResume()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        logState("onSaveInstanceState(..)")
        outState.putCharSequence("username",binding.tvUsername.text)
        outState.putCharSequence("password",binding.tvPassword.text)
        outState.putCharSequence("active",binding.tvActive.text)
        outState.putInt("index",currentIndex)
    }

    override fun onPause(){
        super.onPause()
        logState("onPause()")
    }

    override fun onStop(){
        super.onStop()
        logState("onStop()")
    }

    override fun onDestroy(){
        super.onDestroy()
        logState("onDestroy()")
    }

    override fun onRestart(){
        super.onRestart()
        logState("onRestart()")
    }

    fun logState(name: String){
        Log.i("STATE_DEMO", name)
    }
}







