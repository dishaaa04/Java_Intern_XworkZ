package com.xworkz.stringrepresntation;

public class Notebook {
    private int pages;
    private String type;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Notebook) {
            Notebook other = (Notebook) obj;
            return this.pages == other.pages && this.type.equals(other.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Notebook{pages=" + pages + ", type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return pages + type.hashCode();
    }
}
