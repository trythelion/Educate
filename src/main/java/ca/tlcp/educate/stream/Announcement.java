package ca.tlcp.educate.stream;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Announcement  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String date;
    private String name;
    private String message;
}
