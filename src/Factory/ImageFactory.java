/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Model.BackupImage;
import Model.ImageFile;
import Services.Downloader;
import Services.FileManager;
import java.io.File;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class ImageFactory {

    private final Downloader downloader;

    public ImageFactory() {
        this.downloader = new Downloader();
    }

    public ImageFactory(Downloader downloader) {
        this.downloader = downloader;
    }
    
    public  ArrayList<ImageFile> generateImages(ResultSet result) throws SQLException {
        
        ArrayList<ImageFile> images = new ArrayList<>();
        
        downloader.start();
        
        while (result.next()) {
            
            File localImage = new File(FileManager.getDefaultFolder() +"images/"+ result.getString("image_name"));
            
            downloader.download(result.getBinaryStream("image_bytes"), localImage);
            
            ImageFile image = new ImageFile(localImage);
            
            images.add(image);
        }
        
        return images;
    }
    
    public BackupImage genereteBackupImage(ResultSet result){
        
            BackupImage image = null;
            
        try{    
            
            image = new BackupImage();
            
            image.setId(new Integer(result.getInt("id_images")));
            
            ImageFile imageFile = new ImageFile(result.getString("image_way"));
            
            if(imageFile.getFile().exists()){
                
                
            }else{
                
                downloader.start();
                downloader.download(result.getBinaryStream("image_bytes"), imageFile.getFile());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ImageFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return image;
    }
    
    public ImageFile generateImage(String name, InputStream input){
        
        File localImage = new File(FileManager.getDefaultFolder() + "Images/" + name);
            
        downloader.download(input, localImage);
            
        ImageFile image = new ImageFile(localImage);
        
        return image;
    }
    
    public  ArrayList<ImageFile> generateImageByFile(ResultSet result) throws SQLException {
    
        ArrayList<ImageFile> images = new ArrayList<>();
        
        while (result.next()) {
            
            
            
            ImageFile image = new ImageFile(result.getString("file_way"));
            
             images.add(image);
        }
        
        return images;
    }
    
    public  ArrayList<ImageFile> generateImagesByPath(ResultSet result, String field) throws SQLException {
    
        ArrayList<ImageFile> images = new ArrayList<>();
        
        while (result.next()) {
            
            ImageFile image = new ImageFile(result.getString(field));
            
             images.add(image);
        }
        
        return images;
    }
    
}
