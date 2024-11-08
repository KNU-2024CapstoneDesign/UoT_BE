package did_career_certification.holder.entity;

import did_career_certification.holder.dto.VerifierResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity(name = "HolderVerifier")
@Getter
@Table(name = "HOLDER_VERIFIER_TB")
public class Verifier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String requestApi;

    @Column(nullable = false)
    private String did;

    public VerifierResponse toDto() {
        return new VerifierResponse(id, name);
    }
}
