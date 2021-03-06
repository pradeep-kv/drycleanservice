package in.ogmatech.techstile.drycleanservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "item_status")
@EntityListeners(AuditingEntityListener.class)
public class ItemStatus implements Serializable {

    private Long idItemStatus;
    private String itemStatusName;
    private Byte isDeleted;
    private Date itemStatusCat;
    private Date itemStatusUat;

    @Id
    @GeneratedValue
    @Column(name = "id_item_status", nullable = false)
    public Long getIdItemStatus() {
        return idItemStatus;
    }

    public void setIdItemStatus(Long idItemStatus) {
        this.idItemStatus = idItemStatus;
    }

    @Column(name = "item_status_name", nullable = true, length = 45)
    public String getItemStatusName() {
        return itemStatusName;
    }

    public void setItemStatusName(String itemStatusName) {
        this.itemStatusName = itemStatusName;
    }

    @Column(name = "is_deleted", nullable = false)
    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonIgnoreProperties(allowGetters = true)
    @Column(name = "item_status_cat", nullable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    public Date getItemStatusCat() {
        return itemStatusCat;
    }

    public void setItemStatusCat(Date itemStatusCat) {
        this.itemStatusCat = itemStatusCat;
    }

    @JsonIgnoreProperties(allowGetters = true)
    @Column(name = "item_status_uat", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    public Date getItemStatusUat() {
        return itemStatusUat;
    }

    public void setItemStatusUat(Date itemStatusUat) {
        this.itemStatusUat = itemStatusUat;
    }

}
