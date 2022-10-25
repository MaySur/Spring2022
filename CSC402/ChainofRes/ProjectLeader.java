public class ProjectLeader extends LeaveHandler{
    private HR superVisor;
    

    public String applyLeave(Leave leave){
        if(leave.getNumberOfDays() <=14)

        if(leave.getEmpTier() >= 3) return "APPROVED by Project Leader";
        else return "DENINED by Project Leader: employee their should be 4 to above to get approved";
        else return superVisor.applyLeave(leave);
    }
    
}
