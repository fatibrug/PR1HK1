package at.campus02.iwi.pictures;

public class pictures {

    public int length;
    public int width;

    public int totalPixels(){
       return length * width;

    }
    public int totalSize(int bytePerPixel){
        return bytePerPixel * totalPixels();

    }
}
