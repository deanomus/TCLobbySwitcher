package de.deanomus.tclobbyswitcher.objects;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemBuilder {

    // MUST !
    private Material
            material;

    private short
            subId;

    private int
            amount;


    // OPTIONIALLY BUT RECOMMENED
    private String
            name;

    // OPTIONIALLY
    private ArrayList<String> lores;


    public ItemBuilder() {
        this.material = Material.STONE;
        this.subId = (short)0;
        this.amount = 1;
    }

    /**
     * Generate finally the ItemStack
     * @return ItemStack
     */
    public ItemStack build() {
        ItemStack item = new ItemStack(material, amount, subId);
        ItemMeta itemMeta = item.getItemMeta();

        // SET (DISPLAY-)NAME
        if (this.name != null) {
            itemMeta.setDisplayName(this.name);
        }
        // SET LORE
        if (this.lores != null && this.lores.size() >= 1) {
            itemMeta.setLore(this.lores);
        }


        item.setItemMeta(itemMeta);
        return item;
    }

    public ItemBuilder addLoreText(String text) {
        if (this.lores == null) {
            this.lores = new ArrayList<String>();
        }
        this.lores.add(text);
        return this;
    }

    public ItemBuilder addLoreText(String[] text) {
        for (String s : text) {
            addLoreText(s);
        }
        return this;
    }



    // GETTER & SETTER

    public Material getMaterial() {
        return material;
    }

    public ItemBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public short getSubId() {
        return subId;
    }

    public ItemBuilder setSubId(short subId) {
        this.subId = subId;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public ItemBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<String> getLores() {
        return lores;
    }

    public ItemBuilder setLores(ArrayList<String> lores) {
        this.lores = lores;
        return this;
    }
}
