package edu.iesam.loginexam1eval.features.login.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.loginexam1eval.features.login.domain.CreateUserUseCase
import edu.iesam.loginexam1eval.features.login.domain.GetUserByNameUseCase
import edu.iesam.loginexam1eval.features.login.domain.User

class SingUpViewModel(
        private val getUserByNameUseCase: GetUserByNameUseCase,
        private val createUserUseCase: CreateUserUseCase
    ): ViewModel() {

    fun singUp(user: User) :Boolean {
        if(getUserByNameUseCase.invoke(user.name) == null) {
            createUserUseCase.invoke(user)
            return true
        } else {
            return false
        }
    }

}