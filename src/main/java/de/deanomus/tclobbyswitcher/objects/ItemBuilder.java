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

    /**
     * Add loretext to lores array
     * @param text
     * @return ItemBuilder
     */
    public ItemBuilder addLoreText(String text) {
        if (this.lores == null) {
            this.lores = new ArrayList<String>();
        }
        this.lores.add(text);
        return this;
    }

    /**
     * Add list of lorelexts to lores array
     * @param text
     * @return ItemBuilder
     */
    public ItemBuilder addLoreText(String[] text) {
        for (String s : text) {
            addLoreText(s);
        }
        return this;
    }



    // GETTER & SETTER

    /**
     * Returns the material
     *
     * @return Material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Sets the material
     * @param material
     * @return ItemBuilder
     */
    public ItemBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    /**
     * Returns the subId of material
     * @return subId
     */
    public short getSubId() {
        return subId;
    }

    /**
     * Sets the subId
     * @param subId
     * @return ItemBuilder
     */
    public ItemBuilder setSubId(short subId) {
        this.subId = subId;
        return this;
    }

    /**
     * Returns the amount
     * @return amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount
     * @param amount
     * @return ItemBuilder
     */
    public ItemBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns the (display-)name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the (display-)name
     * @param name
     * @return ItemBuilder
     */
    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the lores as list
     * @return lores
     */
    public ArrayList<String> getLores() {
        return lores;
    }

    /**
     * Sets the lores
     * @param lores
     * @return ItemBuilder
     */
    public ItemBuilder setLores(ArrayList<String> lores) {
        this.lores = lores;
        return this;
    }
}
