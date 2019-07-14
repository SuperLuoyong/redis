package Bean;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = 699994546456465L;

    private long Id;
    private String roleName;
    private String note;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
