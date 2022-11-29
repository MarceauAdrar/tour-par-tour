package classes;

public class Spirit {
    private String capacityName;
    private float damageMultiplier;

    public Spirit(String capacityName, float damageMultiplier) {
        this.capacityName = capacityName;
        this.damageMultiplier = damageMultiplier;
    }

    public String getCapacityName() {
        return capacityName;
    }

    public void setCapacityName(String capacityName) {
        this.capacityName = capacityName;
    }

    public float getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(float damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }
}
