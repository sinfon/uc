package top.sinfonia.uc.domain.model.user;

import lombok.Data;
import org.apache.commons.lang.Validate;
import top.sinfonia.uc.domain.shared.ValueObject;

import javax.persistence.Embeddable;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/10/25 17:56<br>
 * <b>Author:</b> Asher<br>
 */
@Data
@Embeddable
public class UserId implements ValueObject<UserId> {
    private String id;

    public UserId() {
    }

    public UserId(String id) {
        Validate.notEmpty(id);
        this.id = id;
    }

    public String idString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserId other = (UserId) o;

        return sameValueAs(other);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean sameValueAs(UserId other) {
        return other != null && this.id.equals(other.id);
    }

    @Override
    public String toString() {
        return id;
    }

}
