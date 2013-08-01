package td.entity.mob;

import td.entity.Entity;

public class Mob extends Entity {
	
	private final int minHealth = 0;
	private int maxHealth;
	private int currHealth;
	private int armorValue;
	private int attackDamage;
	private int movementSpeed;
	private int speedMod;
	private float fireResist, iceResist, lightningResist, earthResist;
	
	public Mob(int mH, int aV, int aD, int mS, int i, int k,
			   float fR, float iR, float lR, float eR) {
		this.maxHealth = mH;
		this.armorValue = aV;
		this.attackDamage = aD;
		this.movementSpeed = mS;
		this.x = i;
		this.y = k;
		this.fireResist = fR;
		this.iceResist = iR;
		this.lightningResist = lR;
		this.earthResist = eR;
	}
	
	public void move(int i, int k) {
		x = x + ((i * movementSpeed) / speedMod);
		y = y + ((k * movementSpeed) / speedMod);
	}
	
	public void takeDamage(int dmg, attackType aType) {
		int modDmg = 0;
		if (aType == attackType.FIRE) {
			modDmg = (int) (dmg * (1 - fireResist));
		} else if (aType == attackType.ICE) {
			modDmg = (int) (dmg * (1 - iceResist));
		} else if (aType == attackType.LIGHTNING) {
			modDmg = (int) (dmg * (1 - lightningResist));
		} else if (aType == attackType.EARTH) {
			modDmg = (int) (dmg * (1 - earthResist));
		}

		if (modDmg <= 0) modDmg = 1;
		
		currHealth -= modDmg;
		if (currHealth <= minHealth) {
			
			remove();
		}
	}
	
	public void heal(int dmg) {
		if (currHealth + dmg > maxHealth) {
			currHealth = maxHealth;
		} else {
			currHealth += dmg;
		}
	}
	
	
}
