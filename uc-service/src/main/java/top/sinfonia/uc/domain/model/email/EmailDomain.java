package top.sinfonia.uc.domain.model.email;

import lombok.Data;

import javax.persistence.*;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/10/26 17:37<br>
 * <b>Author:</b> Asher<br>
 */
@Data
@Entity
@Table(name = "t_uc_email_domain")
public class EmailDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "domain_type", nullable = false)
    private EmailDomainType domainType;

    @Column(name = "value", nullable = false)
    private String value;
}
