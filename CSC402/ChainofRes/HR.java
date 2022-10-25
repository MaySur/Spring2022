public class HR extends LeaveHandler  {
    private Manager superVisor;
    

    public String applyLeave(Leave leave){
        if(leave.getNumberOfDays() <=21)

        if(leave.getEmpTier() >= 3 && leave.getReason() != ReasonType.REGULAR) return "APPROVED by HR";
        else return "DENINED by HR: employee their should be 3 or above & reason type should not be \"Regular\" to get approved";
        else return superVisor.applyLeave(leave);
    }
    
}
