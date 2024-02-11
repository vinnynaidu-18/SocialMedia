public class Logging {
    public String userName;
    public String password;
    public Long  mobileNo;
    public String otp;

    public Logging(long mobileNo, String otp) {
        this.mobileNo = mobileNo;
        this.otp = otp;
    }

    boolean login(long mobileNo, String otp) {
        return (this.mobileNo == mobileNo && this.otp.equals(otp));

    }
}



