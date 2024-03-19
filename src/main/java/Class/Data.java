/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

/**
 *
 * @author Admin
 */
public class Data {
    public File file;
    public PDDocument document;

    public Vector<PDPage> list = new Vector<PDPage>();

    public Data(String filePath) throws IOException{
        this.file = new File(filePath);
        this.init();
    }
    private void init() throws IOException{
        this.document = PDDocument.load(file);
        for(int i = 0; i < document.getNumberOfPages(); i++){
            list.add(document.getPage(i));
        }
    }
}
