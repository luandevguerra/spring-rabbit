package me.shockyng.cloud.rabbit.resource

import me.shockyng.cloud.rabbit.rabbit.EmployeeSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@EnableBinding(EmployeeSource::class)
@RequestMapping("/notify")
@RestController
class EmployeeNotifierResource {

    @Autowired
    private lateinit var employeeSource: EmployeeSource

    @PostMapping
    fun notifyEmployee() {
        employeeSource.notifyEmployee().send(MessageBuilder.withPayload("Message content").build())
    }
}