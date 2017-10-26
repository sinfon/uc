package top.sinfonia.uc.domain.model.email;

import lombok.Data;

import javax.persistence.*;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/10/26 17:28<br>
 * <b>Author:</b> Asher<br>
 */
@Data
@Entity
@Table(name = "t_uc_email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "email_domain_id", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private EmailDomain emailDomain;

}
