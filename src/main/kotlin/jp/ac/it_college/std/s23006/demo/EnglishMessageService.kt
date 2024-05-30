package jp.ac.it_college.std.s23006.demo

import org.apache.logging.log4j.message.Message
import org.springframework.stereotype.Component

@Component("EnglishMessageService")
class EnglishMessageService : MessageService {
    override fun welcome() = "Welcome"
}