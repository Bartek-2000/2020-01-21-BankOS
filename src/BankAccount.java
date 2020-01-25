import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
    private Long id;
    private long accountNumber;
    private double accountBalance;
    private Date creationDate;
    private SimpleDateFormat ft= new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCreationDate() {
        return ft.format(creationDate);
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BankAccount(long id, long accountNumber, double accountBalance, Date creationDate) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", creationDate=" + creationDate +
                '}';
    }
}
