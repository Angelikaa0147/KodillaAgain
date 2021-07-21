package Modul3;

/**
 * Created by &[User] and &[Date].
 */
public class Payment {

    private double baseSalary;
    private double bonus;
    private double extraLoyalBonus;

    public Payment(double baseSalary, double bonus, double extraLoyalBonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.extraLoyalBonus = extraLoyalBonus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getExtraLoyalBonus() {
        return extraLoyalBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (Double.compare(payment.baseSalary, baseSalary) != 0) return false;
        if (Double.compare(payment.bonus, bonus) != 0) return false;
        return Double.compare(payment.extraLoyalBonus, extraLoyalBonus) == 0;
    }




}
