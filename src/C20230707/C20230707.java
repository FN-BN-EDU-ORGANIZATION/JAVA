package C20230707;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/* <어려운점>
 * 활용부분에서 어려움을 느낌 연습만이 살길..!
 * 정리
 * <Buffer>
 * Buffer(버퍼)는 데이터를 임시로 저장하거나 전송하는 데 사용되는 메모리 영역
`* 버퍼는 데이터를 일시적으로 저장하고 나중에 한꺼번에 처리하는 데 사용되며, 입출력 작업이나 데이터 전송 등에서 많이 활용 됨*/


    	public class C20230707 {

    	    public static void main(String[] args) {
//    	        // 버퍼 생성
//    	        ByteBuffer buffer = ByteBuffer.allocate(10);
//
//    	        // 데이터 추가
//    	        buffer.put((byte) 1);
//    	        buffer.put((byte) 2);
//    	        buffer.put((byte) 3);
//
//    	        // 버퍼 정보 출력
//    	        System.out.println("Buffer capacity: " + buffer.capacity());
//    	        System.out.println("Buffer position: " + buffer.position());
//    	        System.out.println("Buffer limit: " + buffer.limit());
//
//    	        // 버퍼 내 데이터 읽기
//    	        buffer.flip(); // 읽기 모드로 전환
//    	        while (buffer.hasRemaining()) {
//    	            byte data = buffer.get();
//    	            System.out.println("Read data: " + data);
//    	        }
//
//    	        // 버퍼 초기화
//    	        buffer.clear();
//
//    	        // 버퍼 정보 출력
//    	        System.out.println("Buffer position: " + buffer.position());
//    	        System.out.println("Buffer limit: " + buffer.limit());

    	        //------------------------2번
//    	        String serverAddress = "127.0.0.1";
//    	        int serverPort = 8080;
//
//    	        try {
//    	            // 소켓 채널 열기
//    	            SocketChannel socketChannel = SocketChannel.open();
//    	            socketChannel.connect(new InetSocketAddress(serverAddress, serverPort));
//
//    	            // 버퍼 생성
//    	            ByteBuffer buffer2 = ByteBuffer.allocate(1024);
//
//    	            // 데이터 전송
//    	            String message = "Hello, Server!";
//    	            buffer2.put(message.getBytes());
//    	            buffer2.flip(); // 쓰기 모드에서 읽기 모드로 전환
//    	            socketChannel.write(buffer2);
//
//    	            // 버퍼 비우기
//    	            buffer2.clear();
//
//    	            // 데이터 수신
//    	            int bytesRead = socketChannel.read(buffer2);
//    	            if (bytesRead != -1) {
//    	                buffer2.flip(); // 읽기 모드로 전환
//    	                byte[] data = new byte[buffer2.remaining()];
//    	                buffer2.get(data);
//    	                String receivedMessage = new String(data);
//    	                System.out.println("Received message: " + receivedMessage);
//    	            }
//
//    	            // 소켓 채널 닫기
//    	            socketChannel.close();
//
//    	        } catch (IOException e) {
//    	            e.printStackTrace();
//    	        }
//    	        
    	       // -----------------------3번
    	        
    	       
    	            String filePath = "path/to/file.txt";

    	            try (FileInputStream fis = new FileInputStream(filePath);
    	                 FileChannel channel = fis.getChannel()) {

    	                // 버퍼 생성
    	                ByteBuffer buffer = ByteBuffer.allocate(1024);

    	                // 데이터 읽기
    	                int bytesRead = channel.read(buffer);
    	                while (bytesRead != -1) {
    	                    buffer.flip(); // 읽기 모드로 전환

    	                    // 버퍼 내 데이터 처리
    	                    while (buffer.hasRemaining()) {
    	                        byte data = buffer.get();
    	                        System.out.println("Read data: " + data);
    	                    }

    	                    buffer.clear(); // 버퍼 비우기
    	                    bytesRead = channel.read(buffer);
    	                }

    	            } catch (IOException e) {
    	                e.printStackTrace();
    	            }
    	    }
    	}