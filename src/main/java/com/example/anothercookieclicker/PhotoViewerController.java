package com.example.anothercookieclicker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.util.ArrayList;

public class PhotoViewerController {
    public Button buttonNext;
    public Button buttonBack;
    public ImageView sportImg;
    public Label sportTitle;

    ArrayList<Image> imageGallery = new ArrayList<>();
    int currentImage;

    public void initialize() throws Exception {
        //Images
        {
            FileInputStream input = new FileInputStream("src/basketball.jpeg");
            imageGallery.add(new Image(input));
            input = new FileInputStream("src/soccer.jpg");
            imageGallery.add(new Image(input));
            input = new FileInputStream("src/badminton.png");
            imageGallery.add(new Image(input));
            input = new FileInputStream("src/football.png");
            imageGallery.add(new Image(input));
            input = new FileInputStream("src/baseball.png");
            imageGallery.add(new Image(input));

            currentImage = 0;
            sportImg.setImage(imageGallery.get(currentImage));
        }
    }

    public void changePicture() {
        // update number to next image number
        if (currentImage < imageGallery.size() - 1) {
            currentImage = currentImage + 1;
        } else {
            currentImage = 0;
        }
        // get the next image
        sportImg.setImage(imageGallery.get(currentImage));
    }

    public void changeBack() {
        currentImage = currentImage - 1;
        currentImage = (currentImage + imageGallery.size()) % imageGallery.size();
        sportImg.setImage(imageGallery.get(currentImage));
    }
}
