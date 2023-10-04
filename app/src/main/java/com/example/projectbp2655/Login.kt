package com.example.projectbp2655

class Login {
    var username = ""
    var password = ""

    fun loginCheck():Boolean {
        if(username.equals("Fauzan")&&password.equals("123")){
            return false
        }else{
            return true
        }
    }
}