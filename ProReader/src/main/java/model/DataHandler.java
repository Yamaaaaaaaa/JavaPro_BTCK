/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class DataHandler {
    private Vector<Book_Name_and_Path> libraryList; //Key: Name, Value: Path.
    private Vector<Book> recentList;

    public Vector<Book_Name_and_Path> getLibraryList() {
        return libraryList;
    }

    public void setLibraryList(Vector<Book_Name_and_Path> libraryList) {
        this.libraryList = libraryList;
    }

    public Vector<Book> getRecentList() {
        return recentList;
    }

    public void setRecentList(Vector<Book> recentList) {
        this.recentList = recentList;
    }
    
    
    public void Read_Libarary(){
        this.libraryList = new Vector<>();
       
        File directory = new File("C:\\Users\\Admin\\Desktop\\ProReader\\src\\main\\java\\sourceFilePDF");
        File[] files = directory.listFiles();
        for (File file : files) {
            libraryList.add(new Book_Name_and_Path(file.getName(), file.getAbsolutePath()));
        }
//        for(Book_Name_and_Path s: libraryList){
//            System.out.println(s);
//        }
    }
    public void Read_Recent_Book_List(){
        this.recentList = new Vector<>();
        File directory = new File("C:\\Users\\Admin\\Desktop\\ProReader\\src\\main\\java\\save_Book_Object");
        File[] files = directory.listFiles();
        for (File f : files) {
            System.out.println("OKEEE");
            try {
                InputStream is = new FileInputStream(f);

                //der ghi du lieu: tao 1 doitg oos giup ghi doi tuong xuong file
                ObjectInputStream ois = new ObjectInputStream(is);
                Book book = (Book) ois.readObject();
                this.recentList.add(book);
                System.out.println(book);
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void Write_RecentBook_to_File(){
        String folder_Path = "C:\\Users\\Admin\\Desktop\\ProReader\\src\\main\\java\\save_Book_Object";
        
        int cnt = 0;
        for(Book book : recentList){
            try {
                String filePath = folder_Path + "\\" + cnt + ".txt";
                File file = new File(filePath);
                OutputStream os = new FileOutputStream(file);

                //der ghi du lieu: tao 1 doitg oos giup ghi doi tuong xuong file
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(book);
                oos.flush();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }           
            cnt++;
        }
    }
    
    // Kiểm tra khi mở Book mới, nó đã tồn tại tronng RecentList chưa.
        // Nếu chưa thì tạo 1 Class Book mới cho nó
        // Nếu rồi thì bật chính cái đó lên.
    public Book check_ExistBook_in_RecentList(String nameBook, String pathBook){
        int checkExist = 0;
        Book bookTMP = null;
        for(Book book : recentList){
            if(book.getBookName().equals(nameBook) && book.getBookPath().equals(pathBook)){
                checkExist = 1;
                bookTMP = book;
                break;
            }
        }
        if(checkExist == 0){
            Vector<String> listMark = new Vector<>();
            Vector<String> listMark_Note = new Vector<>();
            Book b = new Book(pathBook,nameBook,listMark, listMark_Note);
            return b;
        }
        return bookTMP;
    }
    
    
    public void check_addNewBook_in_RecentList(Book book_readed){
        int checkExist = 0;
        int id = -1;
        for(int i = 0 ; i < recentList.size(); i++){
            if(recentList.get(i).getBookName().equals(book_readed.getBookName())){
                checkExist = 1;
                id = i;
                break;
            }
        }
        if(checkExist == 0){     
            recentList.add(book_readed);
        }
        else{
            recentList.remove(id);
            recentList.add(book_readed);
        }
    }
    
}
