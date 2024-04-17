package ca.tlcp.educate.post;

import ca.tlcp.educate.server.ServerSettings;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AID;
    private String name;
    private String instructions;
    private String publicAttachmentPath;

    public void setPublicAttachmentPath() {
        publicAttachmentPath = ServerSettings.dfAssignmentFolder() + "/" + AID+ "/";
    }

}
