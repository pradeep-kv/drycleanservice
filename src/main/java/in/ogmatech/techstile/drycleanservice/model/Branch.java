package in.ogmatech.techstile.drycleanservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "branch")
@EntityListeners(AuditingEntityListener.class)
public class Branch extends ResourceSupport implements Serializable{

    private Long idBranch;
    private String branchCode;
    private String branchName;
    private String branchPlace;
    private Byte isDeleted;
    private Date branchCat;
    private Date branchUat;

    @Id
    @GeneratedValue
    @Column(name = "id_branch", nullable = false)
    public Long getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(Long idBranch) {
        this.idBranch = idBranch;
    }

    @Column(name = "branch_code", nullable = true, length = 4)
    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    @Column(name = "branch_name", nullable = true, length = 45)
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Column(name = "branch_place", nullable = true, length = 45)
    public String getBranchPlace() {
        return branchPlace;
    }

    public void setBranchPlace(String branchPlace) {
        this.branchPlace = branchPlace;
    }

    @Column(name = "is_deleted", nullable = false)
    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonIgnoreProperties(allowGetters = true)
    @Column(name = "branch_cat", nullable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    public Date getBranchCat() {
        return branchCat;
    }

    public void setBranchCat(Date branchCat) {
        this.branchCat = branchCat;
    }

    @JsonIgnoreProperties(allowGetters = true)
    @Column(name = "branch_uat", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    public Date getBranchUat() {
        return branchUat;
    }

    public void setBranchUat(Date branchUat) {
        this.branchUat = branchUat;
    }

}
