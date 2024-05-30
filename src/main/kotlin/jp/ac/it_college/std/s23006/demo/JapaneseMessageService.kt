package jp.ac.it_college.std.s23006.demo

import org.springframework.stereotype.Component

@Component("JapaneseMessageService")
class JapaneseMessageService : MessageService {
    override fun welcome() = "ようこそ"
}