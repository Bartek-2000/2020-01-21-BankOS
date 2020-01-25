public class Bonus{
    private Long id;
    private double salaryBonus;

    public Bonus(long id, double salaryBonus) {
        this.id = id;
        this.salaryBonus = salaryBonus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                "id=" + id +
                ", salaryBonus=" + salaryBonus +
                '}';
    }
}
