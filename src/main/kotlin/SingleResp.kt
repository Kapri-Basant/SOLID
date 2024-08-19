package org.example

/*
class User(val name: String, val email: String) {
    fun sendEmailNotification(message: String) {  println("Sending email to $email with message: $message")  }
    fun authenticateUser(name: String, email: String) { }
    fun authorisationUser(name: String, email: String) : List<Permission> {  return listOf() }
}*/

class User(val name: String, val age: Int, val email: String)

class EmailService {
    fun sendEmailNotification(user: User, message: String) { println("Sending $message to ${user.email}") }
}

class UserAuthentication() {
    fun authenticateUser(user: User) { }
}

class UserAuthorisation() {
    fun authorisationUser(user: User) : List<Permission> { return listOf() }
    data class Permission(val name: String, val accessLevel: Int)
}