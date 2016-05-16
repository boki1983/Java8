package Base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * Created by boki on 5/16/16.
 * Java 8 now has inbuilt encoder and decoder for Base64 encoding.
 */
public class Base64Encoding {
    public static void main(String args[]){
        final String UTF8 = "utf-8";
        final String STR_ENCODE = "TutorialsPoint?java8";
        try {
            // Encode using basic encoder
            String base64encodedString = Base64.getEncoder().encodeToString(STR_ENCODE.getBytes(UTF8));
            System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

            // Decode
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
            System.out.println("Original String: " + new String(base64decodedBytes, UTF8));

            base64encodedString = Base64.getUrlEncoder().encodeToString(STR_ENCODE.getBytes(UTF8));
            System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes(UTF8);
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);


        } catch(UnsupportedEncodingException e){
        System.out.println("Error :" + e.getMessage());
    }
    }
}
