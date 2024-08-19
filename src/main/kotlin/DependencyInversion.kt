package org.example

/*
class EmailSender {
    fun sendEmail(message: String) = println("Sending email: $message")
}

class SmsSender {
    fun sendSms(message: String) = println("Sending SMS: $message")
}

class NotificationService {
    private val emailSender = EmailSender()
    private val smsSender   = SmsSender()

    fun sendNotification(message: String, type: String) {
        when (type) {
            "email" -> emailSender.sendEmail(message)
            "sms"   -> smsSender.sendSms(message)
            else    -> println("Unknown notification type")
        }
    }
}

fun main() {
    val service = NotificationService()
    service.sendNotification("Hello, World!", "email")
    service.sendNotification("Hello, World!", "sms")
}*/

interface NotificationSender {
    fun send(message: String)
}

class EmailSender : NotificationSender {
    override fun send(message: String) = println("Sending email: $message")
}

class SmsSender : NotificationSender {
    override fun send(message: String) = println("Sending SMS: $message")
}

class NotificationService(private val sender: NotificationSender) {
    fun sendWhatever(message: String) = sender.send(message)
}

fun main() {
    val emailSender = EmailSender()
    val smsSender   = SmsSender()

    val emailService = NotificationService(emailSender)
    emailService.sendWhatever("Hello, World!")

    val smsService = NotificationService(smsSender)
    smsService.sendWhatever("Hello, World!")
}