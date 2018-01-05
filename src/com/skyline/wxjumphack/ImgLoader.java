package com.skyline.wxjumphack;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImgLoader {

	/**
	 * 加载图片到内存
	 * @param path
	 * @return
	 * @throws IOException
	 */
    public static BufferedImage load(String path) throws IOException {
        BufferedImage image = null;
        InputStream is = null;
        try {
            is = new BufferedInputStream(new FileInputStream(path));
            image = ImageIO.read(is);
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return image;
    }
}
