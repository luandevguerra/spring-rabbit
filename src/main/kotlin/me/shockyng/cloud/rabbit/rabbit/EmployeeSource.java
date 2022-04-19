package me.shockyng.cloud.rabbit.rabbit;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EmployeeSource {

    @Output("employeeNotifierChannel")
    MessageChannel notifyEmployee();
}
