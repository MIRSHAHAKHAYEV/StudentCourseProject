package com.example.studentcourseproject.service.notification.impl;

import com.example.studentcourseproject.service.notification.INotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("emailService")
public class EmailINotificationService implements INotificationService {
}
