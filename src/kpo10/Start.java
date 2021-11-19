/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo10;

/**
 * класс, который реализовывает начало работы программы
 */
public class Start {
    
     //создаем объект 
    Compiller compiler = new Compiller();
    /**
     * метод для запуска нашего компилятора
    */
    public void result() {
       //метод для получения файла
       compiler.file();
       //метод для перевода в объектный код
       compiler.object();
       //метод для вставки в буфер обмена 
       compiler.buffered();
    }
}
