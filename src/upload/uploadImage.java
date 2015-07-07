package upload;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.image.codec.jpeg.*;

import javax.imageio.ImageIO;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;

@SuppressWarnings("unused")
public class uploadImage {
	private static Boolean lock = false;
	@SuppressWarnings("restriction")
	public synchronized static void uploadImageToServer(String filePath,String serverPath) throws IOException{
		
		synchronized(lock){
			try{
				while(lock)
					lock.wait(50);
			}catch(Exception e){
				
			}
			lock = true;
		//用于存放上传结果路径
			String resultPath = "";
			
			FileOutputStream out = null;
			File f = new File(filePath);
			try{
				if(!f.isFile())
					throw new Exception("这不是一个图片文件");
				if(f!=null&&f.exists()){
					BufferedImage image = ImageIO.read(f);
					if(image!=null){
						BufferedImage tag = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
						tag.getGraphics().drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
						int lastLength = filePath.lastIndexOf(".");
						Date date = new Date(System.currentTimeMillis());
						String strDate = new SimpleDateFormat("yyyyMMddhhmmss").format(date);
						int Random = (int)Math.random()*99;
						String imageName = strDate+Random;
						String fileType = filePath.substring(lastLength);
						resultPath = serverPath+imageName+fileType;
						out = new FileOutputStream(resultPath);
						JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
						JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(tag);
						param.setQuality(0.95f, true);
						param.setDensityUnit(1);
						param.setXDensity(300);
						param.setYDensity(300);
						encoder.setJPEGEncodeParam(param);
						encoder.encode(tag);
						tag = null;
					}
				}
				f = null;
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				out.close();
				out = null;
			}
			lock = false;
		}
	}
}
