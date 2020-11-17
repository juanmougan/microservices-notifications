package com.example.notificationservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notification {
    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String title;

    @NonNull
    private String body;
}
