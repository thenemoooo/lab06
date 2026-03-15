package edu.cmu.cs.cs214.rec04;

/**
 * Delegation (Бүрдмэл) аргаар хэрэгжүүлсэн класс.
 * IntegerList интерфэйсийг хэрэгжүүлж, үйлдлийг дотоод объект руу дамжуулна[cite: 26, 27].
 */
public class DelegationSortedIntList implements IntegerList {
    
    // Жагсаалтыг хадгалах функциональ байдлыг дамжуулах дотоод объект [cite: 27, 28]
    private SortedIntList list = new SortedIntList();
    private int totalAdded = 0;

    @Override
    public boolean add(int element) {
        totalAdded++; // Нэмэх оролдлого бүрийг тоолно [cite: 15, 29]
        return list.add(element); // Үйлдлийг дотоод объект руу дамжуулна [cite: 28]
    }

    @Override
    public boolean addAll(IntegerList elements) {
        totalAdded += elements.size(); // Жагсаалтын хэмжээгээр тоолуурыг нэмнэ [cite: 15, 29]
        return list.addAll(elements); // Үйлдлийг дамжуулна [cite: 28]
    }

    // Бусад IntegerList интерфэйсийн аргуудыг шууд дамжуулах (Delegation) [cite: 28]
    @Override
    public int get(int index) { return list.get(index); }

    @Override
    public boolean remove(int element) { return list.remove(element); }

    @Override
    public boolean removeAll(IntegerList elements) { return list.removeAll(elements); }

    @Override
    public int size() { return list.size(); }

    /**
     * Нийт нэмэгдсэн элементийн тоог авах функц[cite: 15, 29].
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}