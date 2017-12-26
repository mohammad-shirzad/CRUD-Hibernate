package core.model.dto;

import org.springframework.context.annotation.Primary;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

public class BaseDto {
    public Date LastModificationDate;

    public Date getLastModificationDate() {
        return LastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        LastModificationDate = lastModificationDate;
    }

}
