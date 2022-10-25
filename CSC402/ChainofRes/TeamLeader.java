public class TeamLeader extends LeaveHandler {

    private ProjectLeader superVisor;
  

   

    public String applyLeave(Leave leave){
        if(leave.getNumberOfDays() <=7)

        if(leave.getEmpTier() >= 4) return "APPROVED by Team Leader";
        else return "DENINED by Team Leader: employee their should be 4 to above to get approved";
        else return superVisor.applyLeave(leave);
    }
    
}