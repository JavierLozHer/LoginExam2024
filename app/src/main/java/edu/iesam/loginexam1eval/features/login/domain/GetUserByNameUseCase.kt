package edu.iesam.loginexam1eval.features.login.domain

class GetUserByNameUseCase(private val loginData: LoginData) {

    fun invoke(name: String) : User? {
        return loginData.getUserByName(name)
    }
}