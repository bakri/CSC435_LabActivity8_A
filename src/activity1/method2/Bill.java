package activity1.method2;

public class Bill {
    private String recordNo;
    private String userId;
    private double paymentAmount;

    public Bill(String recordNo, String userId, double paymentAmount) {
        this.recordNo = recordNo;
        this.userId = userId;
        this.paymentAmount = paymentAmount;
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "recordNo='" + recordNo + '\'' +
                ", userId='" + userId + '\'' +
                ", paymentAmount=" + paymentAmount;
    }
}
