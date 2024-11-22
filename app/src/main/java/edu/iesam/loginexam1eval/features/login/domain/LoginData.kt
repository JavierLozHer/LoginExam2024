package edu.iesam.loginexam1eval.features.login.domain

interface LoginData {

    fun getUserByName(name: String) : User?

    fun createUser(user: User)
}