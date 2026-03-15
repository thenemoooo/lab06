

package edu.cmu.cs.cs214.rec04;


/**
 * SortedIntList-ийг удамшуулж, нийт нэмэгдсэн элементийн тоог
 * хянадаг дэд класс. [cite: 7, 13]
 */
public class InheritanceSortedIntList extends SortedIntList {
    
    // Жагсаалт руу нэмэгдсэн нийт элементийн тоог хадгалах хувьсагч [cite: 17]
    private int totalAdded = 0;

    /**
     * Ганц элемент нэмэх функцийг override хийх [cite: 20, 21]
     */
    @Override
    public boolean add(int element) {
        // Нэмэх оролдлого хийх бүрт тоолуурыг нэмэгдүүлнэ [cite: 15]
        totalAdded++;
        // Эцэг классын (SortedIntList) үндсэн add үйлдлийг дуудна [cite: 16]
        return super.add(element);
    }

    /**
     * Олон элементийг нэгэн зэрэг нэмэх функцийг override хийх [cite: 20, 21]
     */
    @Override
    public boolean addAll(IntegerList list) {
        // Орж ирсэн жагсаалтын хэмжээгээр тоолуурыг нэмэгдүүлнэ [cite: 15, 22]
        totalAdded += list.size();
        // Эцэг классын addAll үйлдлийг дуудна [cite: 16]
        return super.addAll(list);
    }

    /**
     * Үүсгэснээс хойш нийт нэмэгдсэн элементийн тоог буцаах (access method) [cite: 15]
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}