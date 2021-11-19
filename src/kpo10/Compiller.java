/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo10;

/**
 * класс компилятор 
 */
public class Compiller {
    String code,text;
    /**
     * метод получения текса кода из класса
     */
    public void file() {
        FileGet fileget = new FileGet();
        code = fileget.getText();
    }
    /**
     * метод для получения объектного кода
     */
    public void object(){
        ObjectCode objectCode = new ObjectCode();
        text = objectCode.compilation(code); 
    }  
    /**
     * метод для вставки кода в буфер обмена
     */
    public void buffered(){
        BufferText bufText = new BufferText();
        bufText.insert(text);   
    }
    
}
