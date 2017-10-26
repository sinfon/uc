package top.sinfonia.uc.domain.model.user;

import lombok.Data;

import javax.persistence.*;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/10/25 17:29<br>
 * <b>Author:</b> Asher<br>
 */
@Data
@Entity
@Table(name = "t_uc_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "id", column = @Column(name = "user_id", unique = true, updatable = false))
    })
    private UserId userId;

    @Column(name = "email")
    private String email;
}
