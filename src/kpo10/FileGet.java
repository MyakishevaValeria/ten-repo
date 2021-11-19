/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo10;

import java.io.File;

/**
 * класс для получения кода из текстового файла
 */
public class FileGet {

   String fileName = "code.txt";
    
   /**
    * метод для получения кода из текстового файла
    * @return - строка с кодом
    */
    public String getText() {
        File f1 = new File(fileName); 
        String s = null;
        //реализация получения текста
        System.out.println("Получаем текст из файла");
        return s;
    }   
    
}
