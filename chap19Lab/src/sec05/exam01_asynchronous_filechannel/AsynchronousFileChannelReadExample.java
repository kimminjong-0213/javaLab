package sec05.exam01_asynchronous_filechannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelReadExample {
	public static void main(String[] args) throws Exception {
		//胶饭靛钱 积己
		ExecutorService executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors() 
		);

		for(int i=0; i<10; i++) {
			Path path = Paths.get("C:/Temp/file" + i + ".txt");
			
			//厚悼扁 颇老 盲澄 积己
			AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
				path, 
				EnumSet.of(StandardOpenOption.READ),
				executorService
			);
			
			ByteBuffer byteBuffer = ByteBuffer.allocate((int)fileChannel.size());
			
			//梅何 按眉 积己
			class Attachment {
				Path path;
				AsynchronousFileChannel fileChannel;
				ByteBuffer byteBuffer;
			}
			Attachment attachment = new Attachment();
			attachment.path = path;
			attachment.fileChannel = fileChannel;
			attachment.byteBuffer = byteBuffer;
			
			//CompletionHandler 按眉 积己
			CompletionHandler<Integer, Attachment> completionHandlernew = 
				new CompletionHandler<Integer, Attachment>() {
				@Override
				public void completed(Integer result, Attachment attachment) {
					attachment.byteBuffer.flip();
					
					Charset charset = Charset.defaultCharset();
					String data = charset.decode(attachment.byteBuffer).toString();
					
					System.out.println(attachment.path.getFileName() + " : " + data + " : " + Thread.currentThread().getName());
					try { fileChannel.close(); } catch (IOException e) {
						//e.printStackTrace();
					}
				}
				@Override
				public void failed(Throwable exc, Attachment attachment) {
					exc.printStackTrace();
					try { fileChannel.close(); } catch (IOException e) {}
				}
			};
			
			//颇老 佬扁
			fileChannel.read(byteBuffer, 0, attachment, completionHandlernew);
		}
		
		//胶饭靛钱 辆丰
		//Thread.sleep(1000);
		executorService.shutdown();
	}
}
