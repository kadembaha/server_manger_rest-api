package com.getarrays.server.model;

import com.getarrays.server.enumeration.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "IP address cannot be empty or null")
    private String ipAddress;

    private String name;

    private String memory;

    private String type;

    private String imageUrl;

    private Status status;
}
