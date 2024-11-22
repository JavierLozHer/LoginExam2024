package edu.iesam.loginexam1eval.features.login.domain

class CreateUserUseCase(private val loginData: LoginData) {

    fun invoke(user: User) {
        loginData.createUser(user)
    }
}