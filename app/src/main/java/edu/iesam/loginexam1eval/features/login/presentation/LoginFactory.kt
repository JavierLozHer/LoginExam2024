package edu.iesam.loginexam1eval.features.login.presentation

import android.content.Context
import edu.iesam.loginexam1eval.features.login.data.LoginDataSource
import edu.iesam.loginexam1eval.features.login.data.local.LoginXmlLocalDataSource
import edu.iesam.loginexam1eval.features.login.domain.CreateUserUseCase
import edu.iesam.loginexam1eval.features.login.domain.GetUserByNameUseCase

class LoginFactory(context: Context) {

    private val loginXmlLocalDataSource = LoginXmlLocalDataSource(context)
    private val loginDataSource = LoginDataSource(loginXmlLocalDataSource)
    private val getUserByNameUseCase = GetUserByNameUseCase(loginDataSource)
    private val createUserUseCase = CreateUserUseCase(loginDataSource)
    val singUpViewModel = SingUpViewModel(getUserByNameUseCase, createUserUseCase)

}