package com.example.loginv2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel : ViewModel() {
    private val _user = MutableStateFlow<String>("")
    private val _password = MutableStateFlow<String>("")
    val user = _user.asStateFlow()
    val password = _password.asStateFlow()

    fun login(user: String?, password: String?): String {
        if (user.equals("user1") && password.equals("user1"))
            return "Welcome ${user}!"
        else
            return "Access Denied!"
    }
}