/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.p.l.p0001;

/**
 *
 * @author ASUS
 */
public class Subject {
    public String subID, subName;
    private int credit;
    boolean canDelete = true;
//    Subject sub;
    Subject sub;

    public Subject() {
    }

    public Subject(String subID, String subName, int credit) {
        this.subID = subID;
        this.subName = subName;
        this.credit = credit;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
