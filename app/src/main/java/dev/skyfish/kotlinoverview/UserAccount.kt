package dev.skyfish.kotlinoverview

import android.util.Log

open class UserAccount (
    var username: String,
    var password: String,
    var subActive: Boolean = false,
    var isLocked: Boolean = false,
){

    fun unlock(){
        isLocked = false
    }

    fun lock(){
        isLocked = true
    }

    fun resetPassword(newPassword: String){
        password = newPassword
    }

    fun changeUsername(newUsername: String){
        username = newUsername
    }

    open fun userToString(): String {
        return "username = $username\npassword = $password\nsubActive = $subActive"
    }

    fun printlog(){
        val text = userToString()
        Log.i("DEMO",text)
    }

}