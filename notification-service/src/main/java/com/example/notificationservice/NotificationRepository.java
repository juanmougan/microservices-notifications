package com.example.notificationservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface NotificationRepository extends JpaRepository<Notification, UUID> {

}
