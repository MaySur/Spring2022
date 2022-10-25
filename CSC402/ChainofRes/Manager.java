public class Manager extends LeaveHandler  {
    public String applyLeave(Leave leave){
        if(leave.getNumberOfDays() >21)

        if(leave.getEmpTier() >= 2 && leave.getReason() == ReasonType.SPECIAL) return "APPROVED by HR";
        else return "DENINED by Manager: employee their should be 3 or above & reason type should not be \"Special\" to get approved";
        else return "DENIED by Manager";
    }
    
}
