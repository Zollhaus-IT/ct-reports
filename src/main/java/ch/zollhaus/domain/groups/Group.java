package ch.zollhaus.domain.groups;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
    private Long id;
    private String ctGroupName;
    private String ctGroupId;
    private String ctGroupTypeRoleId;

    public Group() {

    }

    public Group(String ctGroupName, String ctGroupId, String ctGroupTypeRoleId) {
        this.ctGroupName = ctGroupName;
        this.ctGroupId = ctGroupId;
        this.ctGroupTypeRoleId = ctGroupTypeRoleId;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCtGroupName() {
        return ctGroupName;
    }

    public void setCtGroupName(String ctGroupName) {
        this.ctGroupName = ctGroupName;
    }

    public String getCtGroupId() {
        return ctGroupId;
    }

    public void setCtGroupId(String ctGroupId) {
        this.ctGroupId = ctGroupId;
    }

    public String getCtGroupTypeRoleId() {
        return ctGroupTypeRoleId;
    }

    public void setCtGroupTypeRoleId(String ctGroupTypeRoleId) {
        this.ctGroupTypeRoleId = ctGroupTypeRoleId;
    }

}
