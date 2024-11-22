package edu.iesam.loginexam1eval.features.login.data

import edu.iesam.loginexam1eval.features.login.data.local.LoginXmlLocalDataSource
import edu.iesam.loginexam1eval.features.login.domain.LoginData
import edu.iesam.loginexam1eval.features.login.domain.User

class LoginDataSource(private val localXml: LoginXmlLocalDataSource) : LoginData {

    override fun getUserByName(name: String) : User? {
         return localXml.findByName(name)
    }

    override fun createUser(user: User) {
        localXml.save(user)
    }

}