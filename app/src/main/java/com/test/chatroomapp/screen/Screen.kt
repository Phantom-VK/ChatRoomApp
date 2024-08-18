package com.test.chatroomapp.screen

sealed class Screen(val route:String){
    data object LoginScreen:Screen("loginscreen")
    data object SignupScreen:Screen("signupscreen")
    data object ChatRoomsScreen:Screen("chatroomscreen")
    data object ChatScreen:Screen("chatscreen")
}